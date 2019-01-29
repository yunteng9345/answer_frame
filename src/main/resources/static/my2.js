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

/* 3、查看题目集 */
function look() {

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
    $.post("/anaylze/read", {
        ids: ids
    }, function(result) {
        /* 后台传来一个true */
        if(result.success) {
            console.log(result.alltimuitem[0].t_id);
            window.location.replace("http://localhost:8080/anaylze/anaylzeTimuItem?t_id="+result.alltimuitem[0].t_id);
                } else {
                    $.messager.alert("系统提示", "题目集发布失败，请联系云腾！");
                }
            }, "json");


}
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
