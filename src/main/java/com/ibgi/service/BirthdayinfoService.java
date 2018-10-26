package com.ibgi.service;

import com.ibgi.bean.Birthdayinfo;

import java.util.List;

public interface BirthdayinfoService {
    public List<Birthdayinfo> queryAll();
    public List<Birthdayinfo> queryByPage();
}
