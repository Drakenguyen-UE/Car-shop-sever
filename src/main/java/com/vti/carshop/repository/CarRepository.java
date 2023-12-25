package com.vti.carshop.repository;

import com.vti.carshop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.CarPk> {
}
