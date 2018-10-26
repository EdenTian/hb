package com.ibgi.service.serviceimpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ibgi.bean.HandOutBean;
import com.ibgi.bean.Handout;
import com.ibgi.mapper.HandoutMapper;
import com.ibgi.service.HandOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandOutServiceImpl implements HandOutService {
    @Autowired
    private HandoutMapper handoutMapper;
    public List<Handout> queryAll() {
        return handoutMapper.selectAll();
    }

    public List<Handout> queryByCondition(HandOutBean handOut) {
        return handoutMapper.selectByExample(handOut);
    }

    public List<Handout> queryByPage() {
        Page page = PageHelper.startPage(1, 10);
        System.out.println("page = " + page);
        List<Handout> handouts = this.queryAll();
        System.out.println("handouts = " + handouts.size());
        return handouts;


    }
}
