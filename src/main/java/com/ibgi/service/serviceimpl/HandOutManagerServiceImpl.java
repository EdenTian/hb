package com.ibgi.service.serviceimpl;

import com.ibgi.bean.Handoutmanage;
import com.ibgi.mapper.HandOutManagerMapper;
import com.ibgi.mapper.HandoutMapper;
import com.ibgi.service.HandOutManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandOutManagerServiceImpl implements HandOutManagerService {
    @Autowired
    private HandOutManagerMapper handOutManagerMapper;
    public List<Handoutmanage> queryAll() {
        return handOutManagerMapper.selectAll();
    }

    /**
     * 先去检查改账号和礼物地址id是否正确
     * @param account
     * @param giftAddressId
     * @return
     */
    public Integer insert(String account, Integer giftAddressId) {
        Handoutmanage handoutmanage = new Handoutmanage();
        handoutmanage.setAccount(account);
        handoutmanage.setLocation(giftAddressId.toString());
        return handOutManagerMapper.insertSelective(new Handoutmanage());
    }

    public Integer remove(Integer id) {
        return handOutManagerMapper.deleteByPrimaryKey(id);
    }
}
