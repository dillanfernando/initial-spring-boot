package com.dilfer.boot.essentials.initialbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        super();
        this.roomRepository = roomRepository;
    }

    public List<Room> getRooms(){
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;

    }

}
