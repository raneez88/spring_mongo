package com.mongo.demo.enitity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")

public class RoomBooking
{

    @Id
    private int id;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private int room;
    private String status;

    private ProofDetails proofDetails;

}