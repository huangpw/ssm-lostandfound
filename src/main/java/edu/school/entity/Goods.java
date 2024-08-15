package edu.school.entity;

import java.util.Date;

public class Goods {
    private Integer id;

    private String goods_name;

    private String spot;

    private String gods_img;

    private String create_date;

    private Date create_time;

    private Integer user_id;

    private String note;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot == null ? null : spot.trim();
    }

    public String getGods_img() {
        return gods_img;
    }

    public void setGods_img(String gods_img) {
        this.gods_img = gods_img == null ? null : gods_img.trim();
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date == null ? null : create_date.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}