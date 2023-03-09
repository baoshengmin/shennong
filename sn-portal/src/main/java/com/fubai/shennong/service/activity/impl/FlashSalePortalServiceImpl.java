package com.fubai.shennong.service.activity.impl;

import com.fubai.shennong.activity.FlashSaleService;
import com.fubai.shennong.service.activity.FlashSalePortalService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class FlashSalePortalServiceImpl implements FlashSalePortalService {

    @Reference(timeout = 30000,retries = 0)
    private FlashSaleService flashSaleService;


    @Override
    public String flashSale() {
        return flashSaleService.flashSale();
    }

}
