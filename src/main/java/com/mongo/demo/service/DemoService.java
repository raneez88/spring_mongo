package com.mongo.demo.service;

import com.mongo.demo.enitity.RoomBooking;
import com.mongo.demo.model.PaginatedResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DemoService {
    RoomBooking save(RoomBooking roomBooking);

    List<RoomBooking> findAll();

    void deleteById(int id);

    PaginatedResponse<RoomBooking> findAllWithFilter(Pageable pageable, List<String> filter);
}
