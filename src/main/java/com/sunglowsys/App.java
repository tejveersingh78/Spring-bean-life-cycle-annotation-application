package com.sunglowsys;

import com.sunglowsys.configuration.AppConfig;
import com.sunglowsys.service.HotelService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HotelService hotelService = context.getBean(HotelService.class);
        hotelService.send("sunglowsys@example.com");


        HotelService hotelService1 = context.getBean(HotelService.class);
        hotelService1.send("sunglowsys@example.com");

        context.close();



    }
}
