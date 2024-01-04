package com.vti.carshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarDto {
    private String licensePlate;
    private LocalDate repairDate;
    private String customerName;
    private String catalogs;
    private String carMaker;
}