package com.lqh.pojo;

import java.util.Date;

public class Category {
    private Integer id;
    private String cname;
    private Integer fid;
    private Date creat_name;
    private Date update_time;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCreat_name() {
        return creat_name;
    }

    public void setCreat_name(Date creat_name) {
        this.creat_name = creat_name;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", fid=" + fid +
                ", creat_name=" + creat_name +
                ", update_time=" + update_time +
                '}';
    }
}
