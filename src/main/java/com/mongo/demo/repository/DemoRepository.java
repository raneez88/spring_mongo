package com.mongo.demo.repository;
import com.mongo.demo.enitity.RoomBooking;
import com.mongo.demo.repository.filter.FilterableRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoRepository extends MongoRepository<RoomBooking, Integer> , FilterableRepository<RoomBooking> {

}


