package com.fubai.shennong.service.news;

import com.fubai.shennong.news.dto.SnNewsDTO;

import java.util.List;

public interface SnNewsPortalService {

    void release(SnNewsDTO snNewsDTO);

    List<SnNewsDTO> list(SnNewsDTO snNewsDTO);

    List<SnNewsDTO> hotList();

    SnNewsDTO detail(int id);

}
