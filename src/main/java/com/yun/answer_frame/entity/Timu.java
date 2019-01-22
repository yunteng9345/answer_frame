package com.yun.answer_frame.entity;

import java.util.Date;
import java.util.List;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 12:56
 * @description：题目集实体
 * @modified By：
 * @version: 0.0.1$
 */
public class Timu {
    private  Integer t_id;//题目集标识符
    private String t_name;//题目名称
    private Integer a_id;//管理员唯一标识符
    private Date t_creat_date;//题目创建时间
    private Integer t_num;//题目数
    private String is_time_limit;//题目是否限时
    private Integer time_limit;//如果限制，时长多少。单位秒
    private Integer  t_count;//题目可答次数   默认0，无限次

    public String getIs_time_limit() {
        return is_time_limit;
    }

    public void setIs_time_limit(String is_time_limit) {
        this.is_time_limit = is_time_limit;
    }

    public Integer getTime_limit() {
        return time_limit;
    }

    public void setTime_limit(Integer time_limit) {
        this.time_limit = time_limit;
    }

    public Integer getT_count() {
        return t_count;
    }

    public void setT_count(Integer t_count) {
        this.t_count = t_count;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Date getT_creat_date() {
        return t_creat_date;
    }

    public void setT_creat_date(Date t_creat_date) {
        this.t_creat_date = t_creat_date;
    }

    public Integer getT_num() {
        return t_num;
    }

    public void setT_num(Integer t_num) {
        this.t_num = t_num;
    }

    @Override
    public String toString() {
        return "Timu{" +
                "t_id='" + t_id + '\'' +
                ", t_name='" + t_name + '\'' +
                ", a_id='" + a_id + '\'' +
                ", t_creat_date=" + t_creat_date +
                ", t_num=" + t_num +
                ", is_time_limit='" + is_time_limit + '\'' +
                ", time_limit=" + time_limit +
                ", t_count=" + t_count +
                '}';
    }
}
