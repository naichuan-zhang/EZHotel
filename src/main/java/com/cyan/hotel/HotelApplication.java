package com.cyan.hotel;

import com.cyan.hotel.model.RoomType;
import com.cyan.hotel.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class HotelApplication extends SpringBootServletInitializer {
    @Autowired
    RoomTypeRepository roomTypeRepository;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HotelApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);

        List<RoomType> roomTypes = new ArrayList<>();
        for(RoomType roomType : roomTypes){
            System.out.println(roomType.getRoomType());
        }

    }

    public List<RoomType> getAllRoomTypes(){
        return roomTypeRepository.findAll();
    }

}
