package com.yun.answer_frame.entity;

/**
 * @author ：云腾
 * @date ：Created in 2018/12/27 14:07
 * @description：题目集合中的每个小题目
 * @modified By：
 * @version: 0.0.1$
 */
public class TimuItem extends Timu {
    private String t_id;
    private Integer ti_id;
    private String ti_name;
    private String ti_a;
    private String ti_b;
    private String ti_c;
    private String ti_d;
    private String ti_right;
    private Integer a_count;
    private Integer b_count;
    private Integer c_count;
    private Integer d_count;


    @Override
    public String toString() {
        return "TimuItem{" +
                "t_id='" + t_id + '\'' +
                ", ti_id=" + ti_id +
                ", ti_name='" + ti_name + '\'' +
                ", ti_a='" + ti_a + '\'' +
                ", ti_b='" + ti_b + '\'' +
                ", ti_c='" + ti_c + '\'' +
                ", ti_d='" + ti_d + '\'' +
                ", ti_right='" + ti_right + '\'' +
                ", a_count=" + a_count +
                ", b_count=" + b_count +
                ", c_count=" + c_count +
                ", d_count=" + d_count +
                '}';
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
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

    public Integer getA_count() {
        return a_count;
    }

    public void setA_count(Integer a_count) {
        this.a_count = a_count;
    }

    public Integer getB_count() {
        return b_count;
    }

    public void setB_count(Integer b_count) {
        this.b_count = b_count;
    }

    public Integer getC_count() {
        return c_count;
    }

    public void setC_count(Integer c_count) {
        this.c_count = c_count;
    }

    public Integer getD_count() {
        return d_count;
    }

    public void setD_count(Integer d_count) {
        this.d_count = d_count;
    }

    public void setTi_right(String ti_right) {
        this.ti_right = ti_right;
    }
}
