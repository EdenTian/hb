package com.ibgi.utils;

import java.util.HashMap;

public class Result {
    public static HashMap<String, Object> ResultMap = new HashMap<String, Object>();
    public static  HashMap<String, Object> getResultMap1(Integer code,Object msg,Object data,long count){
        ResultMap.put("code",code);
        ResultMap.put("msg",msg);
        ResultMap.put("data",data);
        ResultMap.put("count",count);
        return ResultMap;
    }
    public static  HashMap<String, Object> getResultMap(Object code,Object msg,Object data,Object count){
        ResultMap.put("code",code);
        ResultMap.put("msg",msg);
        ResultMap.put("data",data);
        ResultMap.put("count",count);
        return ResultMap;
    }
}
