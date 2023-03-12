package com.fubai.shennong.activity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("sn_news")
@Data
public class SnNews {
    private int id;
    private int type;
    private String title;
    private int pv;
    private Date newsTime;
}
