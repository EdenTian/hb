package com.ibgi.service;

import com.ibgi.bean.Gift;

import java.util.List;

public interface GiftService {
    public List<Gift> queryAll();

    public Integer insertGift(Gift gift);

    public Integer updateGift(Gift gift);
}
