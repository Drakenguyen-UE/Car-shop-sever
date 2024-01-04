package com.vti.carshop.mapper;

import com.vti.carshop.dto.AccessoryDto;
import com.vti.carshop.entity.Accessory;
import com.vti.carshop.form.AccessoryCreateForm;
import com.vti.carshop.form.AccessoryUpdateForm;

public class AccessoryMapper {
    public static Accessory map(AccessoryCreateForm form) {
        var accessory = new Accessory();
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setStatusDamaged(form.getStatusDamaged());
        accessory.setRepairStatus(form.getRepairStatus());
        return accessory;
    }

    public static AccessoryDto map(Accessory accessory) {
        var dto = new AccessoryDto();
        dto.setId(accessory.getId());
        var carPk = accessory.getCar().getCarPk();
        dto.setLicensePlate(carPk.getLicensePlate());
        dto.setRepairDate(carPk.getRepairDate());
        dto.setName(accessory.getName());
        dto.setPrice(accessory.getPrice());
        dto.setStatusDamaged(accessory.getStatusDamaged());
        dto.setRepairStatus(accessory.getRepairStatus());
        return dto;
    }

    public static void map(AccessoryUpdateForm form, Accessory accessory) {
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setStatusDamaged(form.getStatusDamaged());
        accessory.setRepairStatus(form.getRepairStatus());
    }
}
