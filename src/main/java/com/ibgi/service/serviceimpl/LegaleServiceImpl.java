package com.ibgi.service.serviceimpl;

import com.ibgi.bean.Legalperson;
import com.ibgi.mapper.LegaleMapper;
import com.ibgi.service.LegaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class LegaleServiceImpl implements LegaleService {
    @Autowired
    private LegaleMapper legaleMapper;
    public List<Legalperson> queryAll() {
        return legaleMapper.selectAll();
    }


    public Integer insert(Legalperson legalperson) {

       return legaleMapper.insertSelective(legalperson);
    }

    public Integer remove(Integer id) {
        return legaleMapper.deleteByPrimaryKey(id);
    }
}
