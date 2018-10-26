package com.ibgi.service;


import com.ibgi.bean.BlackList;

import java.util.List;

public interface BlackListService {
    List<BlackList> queryAll();

    Integer remove(Integer id);

    Integer insert(String account);
}
