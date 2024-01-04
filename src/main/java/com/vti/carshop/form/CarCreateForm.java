package com.vti.carshop.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Setter
@Getter
public class CarCreateForm {
    @NotBlank
    @Length(max = 10)
    private String licensePlate;

    @NotNull
    @PastOrPresent // Yêu cầu ngày sửa chữa là quá khứ hoặc hiện tại
    private LocalDate repairDate;

    @NotBlank
    @Length(max = 50)
    private String customerName;

    @NotBlank
    @Length(max = 50)
    private String catalogs;

    @NotBlank
    @Length(max = 50)
    private String carMaker;
}
