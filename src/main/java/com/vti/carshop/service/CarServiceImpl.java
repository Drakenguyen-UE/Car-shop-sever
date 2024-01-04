package com.vti.carshop.service;

import com.vti.carshop.dto.CarDto;
import com.vti.carshop.entity.Car;
import com.vti.carshop.form.CarCreateForm;
import com.vti.carshop.form.CarUpdateForm;
import com.vti.carshop.mapper.CarMapper;
import com.vti.carshop.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    @Override
    public Page<CarDto> findAll(Pageable pageable) {
        return carRepository.findAll(pageable).map(CarMapper::map);
    }

    @Override
    public CarDto create(CarCreateForm form) {
        var car = CarMapper.map(form);
        var savedCar = carRepository.save(car);
        return CarMapper.map(savedCar);
    }

    @Override
    public CarDto update(CarUpdateForm form) {
        var carPk = new Car.CarPk();
        carPk.setLicensePlate(form.getLicensePlate());
        carPk.setRepairDate(form.getRepairDate());
        var car = carRepository.findById(carPk).get();
        CarMapper.map(form, car);
        var savedCar = carRepository.save(car);
        return CarMapper.map(savedCar);
    }

    @Override
    public void deleteById(Car.CarPk id) {
        carRepository.deleteById(id);
    }
}
