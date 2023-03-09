package com.fubai.shennong.activity.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.fubai.shennong.activity.FlashSaleService;
import com.fubai.shennong.activity.dao.PdStoreMapper;
import com.fubai.shennong.activity.po.PdStore;
import com.fubai.shennong.activity.util.RedissonUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Service(timeout = 30000,retries = 0)
@Slf4j
@RefreshScope
public class FlashSaleServiceImpl implements FlashSaleService {

    @Value("${productId}")
    private int productId;

    @Value("${stock}")
    private int stock;

    @Autowired
    private RedissonUtil redissonUtil;
    @Autowired
    private PdStoreMapper pdStoreMapper;

    @SentinelResource(value = "flashSale",fallback = "flashSaleFallback")
    @Override
    public String flashSale() {
        try{
            Integer stockData = stock;
            if(!redissonUtil.hasString("flashSale")){
                redissonUtil.setString("flashSale",stock);
            } else {
                stockData = Integer.parseInt(String.valueOf(redissonUtil.decr("flashSale")));
            }

            PdStore pdStore = new PdStore();
            pdStore.setProductId(productId);
            pdStore.setNum(stockData);
            pdStoreMapper.insert(pdStore);
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }
        boolean isSuccess = true;
        return isSuccess? "恭喜您抢到了！请稍后去我的订单查看" : "很遗憾您没有抢到，谢谢参与！";
    }

    public String flashSaleFallback(){
        return "很遗憾您没有抢到，谢谢参与！";
    }

}
