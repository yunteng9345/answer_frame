/* 这个 url 经常要用到：add 中的 save，edit 中的 save，独立出来共享 */
var url;
//
// /* 1、添加用户 */
// function openLinkAddDialog() {
//     //console.log("add");
//     $("#dlg").dialog("open").dialog("setTitle", "添加友情链接信息");
//     url = "/superadmin/save";
// }
//
// /* 2、修改用户 */
// function openLinkModifyDialog() {
//     var selectedRows = $("#dg").datagrid("getSelections");
//     if(selectedRows.length != 1) {
//         $.messager.alert("系统提示", "请选择一条要编辑的数据！");
//         return;
//     }
//     var row = selectedRows[0];
//     /*EasyUI 回显信息*/
//     $("#fm").form("load", row);
//     $("#dlg").dialog("open").dialog("setTitle", "编辑友情链接信息");
//     url = "/superadmin/save?a_id=" + row.a_id;
// }

/* 3、发布题目集 */
function publish() {

    var selectedRows = $("#dg").datagrid("getSelections");
    if(selectedRows.length == 0) {
        $.messager.alert("系统提示", "请选择要发布的题目集！");
        return;
    }
    var strIds = [];
    //console.log(selectedRows.length);
    /*SpringBoot 小于号要求*/
    for(var i = 0; i < selectedRows.length; i++) {
        strIds.push(selectedRows[i].t_id);

    }
    /* 转化 "1,2,3" 这种格式  */
    var ids = strIds.join(",");
    console.log(ids);
    $.messager.confirm("系统提示", "您确定要发布这<font color='red'>" + selectedRows.length + "</font>套题目集吗？", function(r) {
        if(r) {
            $.post("/admin/publish", {
                ids: ids
            }, function(result) {

                /* 后台传来一个true */
                if(result.success) {
                    $.messager.alert("系统提示", "题目集发布成功，请到微信小程序查看发布题目！");
                    /*数据变动，需要重新加载数据，作用类似刷新网页*/
                    $("#dg").datagrid("reload");
                } else {
                    $.messager.alert("系统提示", "题目集发布失败，请联系云腾！");
                }
            }, "json");
        }
    });
}
/* 3、删除用户 */
function deleteLink() {

    var selectedRows = $("#dg").datagrid("getSelections");
    if(selectedRows.length == 0) {
        $.messager.alert("系统提示", "请选择要删除的题目集！");
        return;
    }
    var strIds = [];
    //console.log(selectedRows.length);
    /*SpringBoot 小于号要求*/
    for(var i = 0; i < selectedRows.length; i++) {
        strIds.push(selectedRows[i].t_id);

    }
    /* 转化 "1,2,3" 这种格式  */
    var ids = strIds.join(",");
    console.log(ids);
    $.messager.confirm("系统提示", "您确定要删除这<font color='red'>" + selectedRows.length + "</font>套题目集吗？", function(r) {
        if(r) {
            $.post("/admin/delete", {
                ids: ids
            }, function(result) {

                /* 后台传来一个true */
                if(result.success) {
                    $.messager.alert("系统提示", "题目集已成功删除！");
                    /*数据变动，需要重新加载数据，作用类似刷新网页*/
                    $("#dg").datagrid("reload");
                } else {
                    $.messager.alert("系统提示", "题目集删除失败，请联系云腾！");
                }
            }, "json");
        }
    });
}

/* save 保存操作，位于 add、edit 中 */
// function saveLink() {
//
//     $("#fm").form("submit", {
//         url: url,
//         onSubmit: function() {
//             /*前端验证，再次使用EasyUI 提供的校验 class*/
//             return $(this).form("validate");
//         },
//         success: function(result) {
//             var result = eval('(' + result + ')');
//             /* 后台传来一个true */
//             if(result.success) {
//                 $.messager.alert("系统提示", "保存成功！");
//                 resetValue();
//                 $("#dlg").dialog("close");
//                 /*数据变动，需要重新加载数据，作用类似刷新网页*/
//                 $("#dg").datagrid("reload");
//             }
//         }
//     });
// }

/* 清空表单数据 */
function resetValue() {
    $("#admin_name").val("");
    $("#admin_pd").val("");
    $("#academy").val("");
    $("#is_vip").val("");
}

/* 关闭对话框 */
function closeLinkDialog() {
    resetValue();
    $("#dlg").dialog("close");
}

/* 4、增加搜索 */
function searchWebSite() {
    $("#dg").datagrid("load", {
        "name": $("#s_name").val(),
        "word": $("#s_word").val()
    });
}
