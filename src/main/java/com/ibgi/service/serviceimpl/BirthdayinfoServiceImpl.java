package com.ibgi.service.serviceimpl;

import com.ibgi.bean.Birthdayinfo;
import com.ibgi.mapper.BirthdayinfoMapper;
import com.ibgi.service.BirthdayinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirthdayinfoServiceImpl implements BirthdayinfoService {
    @Autowired
    private BirthdayinfoMapper birthdayinfoMapper;
    public List<Birthdayinfo> queryAll() {

        return birthdayinfoMapper.selectAll();
    }

    public List<Birthdayinfo> queryByPage() {
        return null;
    }
}
