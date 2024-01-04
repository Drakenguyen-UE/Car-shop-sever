package com.vti.carshop.service;

import com.vti.carshop.dto.AccessoryDto;
import com.vti.carshop.form.AccessoryCreateForm;
import com.vti.carshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);
}
