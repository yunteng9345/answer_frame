package com.yun.answer_frame.entity;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 14:07
 * @description：题目集合中的每个小题目
 * @modified By：
 * @version: 0.0.1$
 */
public class TimuItem extends Timu {
    private Integer t_id;
    private Integer ti_id;
    private String ti_name;
    private String ti_a;
    private String ti_b;
    private String ti_c;
    private String ti_d;
    private String ti_right;

    @Override
    public String toString() {
        return "TimuItem{" +
                "t_id='" + t_id + '\'' +
                ", ti_id='" + ti_id + '\'' +
                ", ti_name='" + ti_name + '\'' +
                ", ti_a='" + ti_a + '\'' +
                ", ti_b='" + ti_b + '\'' +
                ", ti_c='" + ti_c + '\'' +
                ", ti_d='" + ti_d + '\'' +
                ", ti_right='" + ti_right + '\'' +
                '}';
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getTi_id() {
        return ti_id;
    }

    public void setTi_id(Integer ti_id) {
        this.ti_id = ti_id;
    }

    public String getTi_name() {
        return ti_name;
    }

    public void setTi_name(String ti_name) {
        this.ti_name = ti_name;
    }

    public String getTi_a() {
        return ti_a;
    }

    public void setTi_a(String ti_a) {
        this.ti_a = ti_a;
    }

    public String getTi_b() {
        return ti_b;
    }

    public void setTi_b(String ti_b) {
        this.ti_b = ti_b;
    }

    public String getTi_c() {
        return ti_c;
    }

    public void setTi_c(String ti_c) {
        this.ti_c = ti_c;
    }

    public String getTi_d() {
        return ti_d;
    }

    public void setTi_d(String ti_d) {
        this.ti_d = ti_d;
    }

    public String getTi_right() {
        return ti_right;
    }

    public void setTi_right(String ti_right) {
        this.ti_right = ti_right;
    }
}
