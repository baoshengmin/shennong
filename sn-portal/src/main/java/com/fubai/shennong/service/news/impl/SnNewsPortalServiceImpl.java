package com.fubai.shennong.service.news.impl;

import com.fubai.shennong.news.SnNewsService;
import com.fubai.shennong.news.dto.SnNewsDTO;
import com.fubai.shennong.service.news.SnNewsPortalService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnNewsPortalServiceImpl implements SnNewsPortalService {


    @Reference(timeout = 30000)
    private SnNewsService snNewsService;


    @Override
    public void release(SnNewsDTO snNewsDTO) {
        snNewsService.release(snNewsDTO);
    }

    @Override
    public List<SnNewsDTO> list(SnNewsDTO snNewsDTO) {
        return snNewsService.list(snNewsDTO);
    }

    @Override
    public List<SnNewsDTO> hotList() {
        return snNewsService.hotList();
    }

    @Override
    public SnNewsDTO detail(int id) {
        return snNewsService.detail(id);
    }
}
