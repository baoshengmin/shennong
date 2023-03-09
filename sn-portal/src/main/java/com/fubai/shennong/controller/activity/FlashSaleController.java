package com.fubai.shennong.controller.activity;

import com.fubai.shennong.service.activity.FlashSalePortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlashSaleController {

    @Autowired
    private FlashSalePortalService flashSalePortalService;

    @GetMapping("/activity/flashSale")
    public String flashSale() {
        return flashSalePortalService.flashSale();
    }

}
