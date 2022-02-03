package com.sunglowsys.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Component
public class HotelService {
    private Map<String,String > map = null;

    public HotelService(){
        map = new HashMap<>();
    }

    public void send(String mailTo){
        System.out.println("Inside send method - " + map);
    }

    @PostConstruct
    public void init(){
        map.put("host", "mail.example.com");
        map.put("port", "20");
        map.put("from","example@sunglowsys.com");
        System.out.println("Inside init method - " + map);
    }

    @PreDestroy
    public void destroy(){
        map.clear();
        System.out.println("Inside destroy method - " + map);
    }
}
