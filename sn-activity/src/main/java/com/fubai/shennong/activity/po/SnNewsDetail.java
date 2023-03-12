package com.fubai.shennong.activity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("sn_news_detail")
@Data
public class SnNewsDetail {
    private int id;
    private int newsId;
    private String title;
    private String content;
    private int pv;
    private String newsPerson;
    private String contactMobile;
    private String contactAddr;
    private String remark;
    private Date newsTime;
}
