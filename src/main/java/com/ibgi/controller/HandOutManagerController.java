package com.ibgi.controller;


import com.ibgi.service.HandOutManagerService;
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
 * 礼物管理者
 */
@RestController
@RequestMapping("/handOutManager")
public class HandOutManagerController {
    @Autowired
    private HandOutManagerService handOutManagerService;

    @PostMapping("queryAll")
    public ResponseEntity queryAll(){
        return new ResponseEntity<Map<String,Object>>
                (Result.getResultMap(0,"",handOutManagerService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("insert")
    public ResponseEntity insert(@RequestParam("account") String account,@RequestParam("giftAddress")Integer giftAddressId){
        return new ResponseEntity<Map<String,Object>>
                (Result.getResultMap(0,"",handOutManagerService.insert(account,giftAddressId),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("remove")
    public ResponseEntity remove(@RequestParam("handOutManagerId") Integer id){
        return new ResponseEntity<Map<String,Object>>
                (Result.getResultMap(0,"",handOutManagerService.remove(id),HttpStatus.OK),HttpStatus.OK);
    }
}
