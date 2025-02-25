package com.example.cab_app_backend.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document(collection = "booking")
    @Data

    public class Booking{
        @Id
        private String id;
        private String carid;
        private String driverid;
        private String location;
        private String time;
        private int bookstatus = 0;
        private double totalfee;
        private int paymentstatus = 0;
    }

