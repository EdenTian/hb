package com.ibgi.service.serviceimpl;

import com.ibgi.bean.Birthdayinfo;
import com.ibgi.bean.BlackList;
import com.ibgi.mapper.BirthdayinfoMapper;
import com.ibgi.mapper.BlackListMapper;
import com.ibgi.service.BlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlackListServiceImpl implements BlackListService {
    @Autowired
    private BlackListMapper blackListMapper;
    @Autowired
    private BirthdayinfoMapper birthdayinfoMapper;

    public List<BlackList> queryAll() {
        return blackListMapper.selectAll();
    }

    public Integer remove(Integer id) {
       return  blackListMapper.deleteByPrimaryKey(id);
    }



    
    public Integer insert(String account) {
        Birthdayinfo birthdayinfo = new Birthdayinfo();
        birthdayinfo.setAccount(account);
        if (birthdayinfoMapper.selectOne(birthdayinfo) != null) {
            BlackList blacklist = new BlackList();
            blacklist.setAccount(account);
            return  blackListMapper.insertSelective(blacklist);
        }
        return null;
    }
}
