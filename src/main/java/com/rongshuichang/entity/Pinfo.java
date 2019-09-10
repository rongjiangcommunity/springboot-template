package com.rongshuichang.entity;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@Entity
//@DynamicUpdate
@Table(name = "pinfo")
@Data
public class Pinfo {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "birthmonth")
    private String birthmonth;
    @Column(name = "height")
    private int height;
    @Column(name = "relationship")
    private String relationship;
    @Column(name = "role")
    private int role;
    @Column(name = "income")
    private int income;
    @Column(name = "nid")
    private String nid;
    @Column(name = "certi")
    private String certi;
    @Column(name = "status")
    private int status;
    @Column(name = "aboutme")
    private String aboutme;
    @Column(name = "experience")
    private String experience;
    @Column(name = "futureplan")
    private String futureplan;
    @Column(name = "exp_partner")
    private String exp_partner;
    @Column(name = "upd_time")
    private String upd_time;
    @Column(name = "rev_time")
    private String rev_time;
    @Column(name = "rev_id")
    private String rev_id;


}
