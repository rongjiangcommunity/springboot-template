package com.rongshuichang.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class Userinfo {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "wechat")
    private String wechat;
    @Column(name = "phone_number")
    private String phone_number;
    //届别
    @Column(name = "period")
    private String period;
    //班级
    @Column(name = "g3")
    private String g3;
    @Column(name = "gender")
    private String gender;
    //最高学历、最高学历院校、专业
    @Column(name = "education")
    private String education;
    @Column(name = "living_area")
    private String living_area;
    //工作经历，单位
    @Column(name = "experience")
    private String experience;

}
