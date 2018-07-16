package com.dilfer.boot.essentials.initialbootapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private RoomService roomService;


    @Autowired
    public ApiController(RoomService roomService){
        super();
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getRooms();
    }

}
