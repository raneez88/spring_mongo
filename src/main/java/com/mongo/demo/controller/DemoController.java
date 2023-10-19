package com.mongo.demo.controller;


import com.mongo.demo.enitity.RoomBooking;
import com.mongo.demo.model.PaginatedResponse;
import com.mongo.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {


    private final DemoService service;

    @PostMapping("/addBook")
    public RoomBooking saveBook(@RequestBody RoomBooking roomBooking){
        return service.save(roomBooking);


    }

    @GetMapping("/findAllBooks")
    public List<RoomBooking> getBooks() {

        return service.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        service.deleteById(id);

        return "Deleted Successfully";
    }

    @GetMapping("/findBooks")
    public PaginatedResponse<RoomBooking> filterBooks(@RequestParam int page, @RequestParam int size, @RequestParam List<String> filter) {
        Pageable pageable = PageRequest.of(page, size);

        return service.findAllWithFilter(pageable, filter);
    }
}
