package com.fubai.shennong.activity.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fubai.shennong.activity.po.SnNews;
import com.fubai.shennong.news.dto.SnNewsDTO;

import java.util.List;

public interface SnNewsMapper extends BaseMapper<SnNews> {

    void insert4Id(SnNews snNews);

    List<SnNewsDTO> selectHotList();

    List<SnNewsDTO> selectList(SnNewsDTO snNewsDTO);

}
