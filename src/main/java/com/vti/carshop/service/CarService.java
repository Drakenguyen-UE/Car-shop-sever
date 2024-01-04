package com.vti.carshop.service;

import com.vti.carshop.dto.CarDto;
import com.vti.carshop.entity.Car;
import com.vti.carshop.form.CarCreateForm;
import com.vti.carshop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.CarPk id);
}
