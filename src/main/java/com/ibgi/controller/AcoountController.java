package com.ibgi.controller;

import com.alibaba.fastjson.JSON;
import com.ibgi.service.BirthdayinfoService;
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
 * 账号
 */
@RestController
@RequestMapping("account")
public class AcoountController {
    @Autowired
    private BirthdayinfoService birthdayinfoService;

    @PostMapping("queryAll")
    public String getAccount(){
        HashMap<String, Object> result = Result.getResultMap1(200, "", birthdayinfoService.queryAll(), 1000);
        String s = JSON.toJSONString(result);
        return s;
//        return new ResponseEntity<Map<String,Object>>
//                (Result.getResultMap(0,"",birthdayinfoService.queryAll(),1000), HttpStatus.valueOf(200));
    }
    @PostMapping("queryByPage")
    public ResponseEntity queryByPage(int startpage){
        return new ResponseEntity<Map<String,Object>>
                (Result.getResultMap(0,"",birthdayinfoService.queryAll(),1000),HttpStatus.OK);
    }



}
