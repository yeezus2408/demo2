package com.example.demo.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class order {
    private UUID number;
    private LocalDate startDate;
    private String typeTechnic;
    private String model;
    private String description;
    private String fullName;
    private String numberPhone;
    private String status;
    private String master;
}
