package com.ibgi.service;

import com.ibgi.bean.Handoutmanage;

import java.util.List;

public interface HandOutManagerService {
    List<Handoutmanage> queryAll();

    Integer insert(String account, Integer giftAddressId);

    Integer remove(Integer id);
}
