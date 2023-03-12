package com.fubai.shennong.activity.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fubai.shennong.activity.dao.SnNewsDetailMapper;
import com.fubai.shennong.activity.dao.SnNewsMapper;
import com.fubai.shennong.activity.po.SnNews;
import com.fubai.shennong.activity.po.SnNewsDetail;
import com.fubai.shennong.news.SnNewsService;
import com.fubai.shennong.news.dto.SnNewsDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(timeout = 30000)
@Slf4j
public class SnNewsServiceImpl implements SnNewsService {

    @Autowired
    private SnNewsMapper snNewsMapper;
    @Autowired
    private SnNewsDetailMapper snNewsDetailMapper;


    @Override
    public void release(SnNewsDTO snNewsDTO) {
        SnNews snNews = new SnNews();
        BeanUtils.copyProperties(snNewsDTO,snNews);
        snNewsMapper.insert4Id(snNews);

        SnNewsDetail snNewsDetail = new SnNewsDetail();
        BeanUtils.copyProperties(snNewsDTO,snNewsDetail);
        snNewsDetail.setNewsId(snNews.getId());
        snNewsDetailMapper.insert(snNewsDetail);
    }

    @Override
    public List<SnNewsDTO> list(SnNewsDTO snNewsDTO) {
        return snNewsMapper.selectList(snNewsDTO);
    }

    @Override
    public List<SnNewsDTO> hotList() {
        return snNewsMapper.selectHotList();
    }

    @Override
    public SnNewsDTO detail(int id) {
        SnNews snNews = snNewsMapper.selectById(id);
        if(null == snNews){
            return null;
        }
        QueryWrapper<SnNewsDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("news_id", snNews.getId());
        SnNewsDetail snNewsDetail = snNewsDetailMapper.selectOne(queryWrapper);
        SnNewsDTO snNewsDTO = new SnNewsDTO();
        BeanUtils.copyProperties(snNewsDetail,snNewsDTO);
        BeanUtils.copyProperties(snNews,snNewsDTO);
        return snNewsDTO;
    }
}
