package com.ibgi.service;

import com.ibgi.bean.HandOutBean;
import com.ibgi.bean.Handout;

import java.util.List;

public interface HandOutService {
    public List<Handout> queryAll();
    public List<Handout> queryByCondition(HandOutBean handOut);

    Object queryByPage();
}
