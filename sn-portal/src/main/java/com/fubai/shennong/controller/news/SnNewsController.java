package com.fubai.shennong.controller.news;

import com.fubai.shennong.common.SnResponse;
import com.fubai.shennong.common.SnResponseBuilder;
import com.fubai.shennong.news.dto.SnNewsDTO;
import com.fubai.shennong.service.news.SnNewsPortalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SnNewsController {

    @Resource
    private SnNewsPortalService snNewsPortalService;

    @PostMapping("/news/release")
    public SnResponse release(@RequestBody SnNewsDTO snNewsDTO) {
        snNewsPortalService.release(snNewsDTO);
        return SnResponseBuilder.success();
    }

    @GetMapping("/news/hotList")
    public SnResponse hotList() {
        List<SnNewsDTO> list = snNewsPortalService.hotList();
        return SnResponseBuilder.success(list);
    }

    @PostMapping("/news/list")
    public SnResponse list(@RequestBody SnNewsDTO snNewsDTO) {
        List<SnNewsDTO> list = snNewsPortalService.list(snNewsDTO);
        return SnResponseBuilder.success(list);
    }

    @GetMapping("/news/detail/{id}")
    public SnResponse detail(@PathVariable("id") Integer id) {
        SnNewsDTO snNewsDTO = snNewsPortalService.detail(id);
        return SnResponseBuilder.success(snNewsDTO);
    }

}
