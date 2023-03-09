package com.fubai.shennong.activity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("pd_store")
@Data
public class PdStore {
    private int id;
    private int productId;
    private int num;
}
