package com.mongo.demo.service.impl;

import com.mongo.demo.enitity.RoomBooking;
import com.mongo.demo.model.PaginatedResponse;
import com.mongo.demo.repository.DemoRepository;
import com.mongo.demo.repository.filter.FilteringFactory;
import com.mongo.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final DemoRepository demoRepository;
    @Override
    public RoomBooking save(RoomBooking roomBooking) {
        return demoRepository.save(roomBooking);
    }

    @Override
    public List<RoomBooking> findAll() {
        return demoRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        demoRepository.deleteById(id);
    }

    @Override
    public PaginatedResponse<RoomBooking> findAllWithFilter(Pageable pageable, List<String> filter) {
        Page<RoomBooking> all = demoRepository.findAllWithFilter(RoomBooking.class, FilteringFactory.parseFromParams(filter, RoomBooking.class), pageable);
        return PaginatedResponse.<RoomBooking>builder()
                .currentPage(all.getNumber())
                .totalItems(all.getTotalElements())
                .totalPages(all.getTotalPages())
                .items(all.getContent())
                .hasNext(all.hasNext())
                .build();
    }

}
