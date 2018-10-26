package com.ibgi.controller;

import com.ibgi.bean.Gift;
import com.ibgi.service.GiftService;
import com.ibgi.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;

/**
 * 礼物
 */
@RestController
@RequestMapping("/gift")
public class GiftController {
    @Autowired
    private GiftService giftService;

    /**
     * 查询所有礼物
     * @return
     */
    @PostMapping("queryAll")
    public ResponseEntity queryAll(){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",giftService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }
    /**
     * 上传礼物图片
     */
    @PostMapping("upload")
    public ResponseEntity uploadFile(MultipartFile file, HttpServletRequest request){
        try {
            String realPath = request.getSession().getServletContext().getRealPath("/images");
            file.transferTo(new File(realPath +"/" +file.getOriginalFilename()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",giftService.queryAll(),HttpStatus.OK),HttpStatus.OK);
    }

    /***
     * 新增礼品
     */
    @PostMapping("insertGift")
    public ResponseEntity insertGift(Gift gift){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",giftService.insertGift(gift),HttpStatus.OK),HttpStatus.OK);
    }
    /***
     * 更新礼品信息   包括库存   等等信息
     */
    @PostMapping("updateGift")
    public ResponseEntity updateGift(Gift gift){
        return new ResponseEntity<Map<String,Object>>(Result.getResultMap
                (0,"",giftService.updateGift(gift),HttpStatus.OK),HttpStatus.OK);
    }
    
}
