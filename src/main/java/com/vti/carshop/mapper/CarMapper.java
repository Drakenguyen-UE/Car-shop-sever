package com.vti.carshop.mapper;

import com.vti.carshop.dto.CarDto;
import com.vti.carshop.entity.Car;
import com.vti.carshop.form.CarCreateForm;
import com.vti.carshop.form.CarUpdateForm;

public class CarMapper {
    public static Car map(CarCreateForm form) {
        var car = new Car();
        var carPk = new Car.CarPk();
        carPk.setLicensePlate(form.getLicensePlate());
        carPk.setRepairDate(form.getRepairDate());
        car.setCarPk(carPk);
        car.setCustomerName(form.getCustomerName());
        car.setCatalogs(form.getCatalogs());
        car.setCarMaker(form.getCarMaker());
        return car;
    }

    public static CarDto map(Car car) {
        var dto = new CarDto();
        var carPk = car.getCarPk();
        dto.setLicensePlate(carPk.getLicensePlate());
        dto.setRepairDate(carPk.getRepairDate());
        dto.setCustomerName(car.getCustomerName());
        dto.setCatalogs(car.getCatalogs());
        dto.setCarMaker(car.getCarMaker());
        return dto;
    }

    public static void map(CarUpdateForm form, Car car) {
        car.setCustomerName(form.getCustomerName());
        car.setCatalogs(form.getCatalogs());
        car.setCarMaker(form.getCarMaker());
    }
}
