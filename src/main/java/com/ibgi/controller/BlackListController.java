package com.ibgi.controller;

import com.ibgi.service.BlackListService;
import com.ibgi.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 黑名单
 */
@RestController
@RequestMapping("/blackList")
public class BlackListController {
    @Autowired
    private BlackListService blackListService;

    @PostMapping("queryAll")
    public ResponseEntity queryAll(){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",blackListService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("insert")
    public ResponseEntity insert(@RequestParam("account")String account){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",blackListService.insert(account),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("remove")
    public ResponseEntity remove(@RequestParam("BlackId")Integer id){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",blackListService.remove(id),HttpStatus.OK),HttpStatus.OK);
    }
}
