package com.ibgi.service.serviceimpl;

import com.ibgi.bean.Gift;
import com.ibgi.mapper.GiftMapper;
import com.ibgi.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService {
    @Autowired
    private GiftMapper giftMapper;

    public List<Gift> queryAll() {
        return giftMapper.selectAll();
    }

    public Integer insertGift(Gift gift) {
         return giftMapper.insertSelective(gift);
    }

    public Integer updateGift(Gift gift) {
        return giftMapper.updateByPrimaryKey(gift);
    }
}
