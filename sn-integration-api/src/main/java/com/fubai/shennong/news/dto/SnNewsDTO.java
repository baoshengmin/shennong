package com.fubai.shennong.news.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SnNewsDTO implements Serializable {
    private int id;
    private int type;
    private String title;
    private String content;
    private int pv;
    private String newsPerson;
    private String contactMobile;
    private String contactAddr;
    private String remark;
    private Date newsTime;
}
