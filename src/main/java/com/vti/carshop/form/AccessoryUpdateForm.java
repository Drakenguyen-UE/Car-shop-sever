package com.vti.carshop.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryUpdateForm {
    @NotBlank
    @Length(max = 10)
    private String licensePlate;

    @NotNull // Do NotBlank chỉ dùng cho String nên dùng NotNull
    @PastOrPresent
    private LocalDate repairDate;

    @NotBlank
    @Length(max = 50)
    private String name;

    @NotBlank
    @PositiveOrZero
    private String price;

    @NotBlank
    @Length(max = 50)
    private String statusDamaged;

    @NotBlank
    @Length(max = 50)
    private String repairStatus;
}
