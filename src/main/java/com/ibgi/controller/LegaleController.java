package com.ibgi.controller;

import com.ibgi.bean.Legalperson;
import com.ibgi.service.LegaleService;
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
 * 组织
 */
@RestController
@RequestMapping("/legale")
public class LegaleController {
    @Autowired
    private LegaleService legaleService;

    @PostMapping("queryAll")
    public ResponseEntity queryAll(){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",legaleService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("insert")
    public ResponseEntity insert(Legalperson legalperson){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",legaleService.insert(legalperson),HttpStatus.OK),HttpStatus.OK);
    }
    @PostMapping("remove")
    public ResponseEntity remove(@RequestParam("BlackId")Integer id){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",legaleService.remove(id),HttpStatus.OK),HttpStatus.OK);
    }
}
