package com.fubai.shennong.news.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date newsTime;
}
