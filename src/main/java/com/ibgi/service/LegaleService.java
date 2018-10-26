package com.ibgi.service;

import com.ibgi.bean.Legalperson;

import java.util.List;

public interface LegaleService {
    List<Legalperson> queryAll();

    Integer remove(Integer id);

    Integer insert(Legalperson legalperson);
}
