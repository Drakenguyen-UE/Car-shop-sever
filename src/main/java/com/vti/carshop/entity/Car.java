package com.vti.carshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "car")
public class Car {
    @EmbeddedId
    private CarPk carPk;

    @Column(name = "customer_name", length = 50, nullable = false)
    private String customerName;

    @Column(name = "catalog", length = 50, nullable = false)
    private String catalog;

    @Column(name = "car_maker", length = 50, nullable = false)
    private String carMaker;

    @OneToMany(mappedBy = "car")
    private List<Accessory> accessories;

    @Getter
    @Setter
    @Embeddable
    public static class CarPk {
        @Column(name = "license_plate", length = 10, nullable = false)
        private String licensePlate;

        @Column(name = "repair_date", nullable = false, updatable = false)
        private LocalDateTime repairDate;
    }
}

