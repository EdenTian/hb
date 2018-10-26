package com.ibgi.controller;

import com.alibaba.fastjson.JSON;
import com.ibgi.bean.HandOutBean;
import com.ibgi.service.HandOutService;
import com.ibgi.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 送出
 */
@RestController
@RequestMapping("handout")
public class HandOutController {
    @Autowired
    private HandOutService handOutService;

    @PostMapping("queryAll")
    public String queryAll(){

        HashMap<String, Object> result = Result.getResultMap1(0, "", handOutService.queryAll(), 10000);
        return JSON.toJSONString(result);
    }
    @PostMapping("queryByPage")
    public String queryByPage(){


        HashMap<String, Object> result = Result.getResultMap1(0, "", handOutService.queryByPage(), 10000);
        return JSON.toJSONString(result);
    }
    /**
     * 可以根据领取日期  出生日期   法人信息 所属年份 领取状态 ibgi账号查询
     * @return
     */
    @PostMapping("queryByCondition")
    public ResponseEntity queryByCondition(HandOutBean handOutBean){
        return new ResponseEntity<Map<String,Object>>
                (Result.getResultMap(0,"",handOutService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }

}
