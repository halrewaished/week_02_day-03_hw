package com.example.exersice7.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor @Data
public class Employee {

    @NotNull(message = "The id is required")
    @Min(value = 2, message = "Length must be more than 2")
    private Integer ID ;

    @NotNull(message = "The name is required")
    @Min(value = 4, message = "Length must be more than 4")
    private String name;

    @NotNull(message = "The age is required")
    @Digits(integer = 3, fraction = 2)
    @Min(value = 25, message = "Length must be more than 25")
    private Integer age ;

    @Pattern(regexp = "^(false)$")
    private Boolean onLeave;

    @NotNull(message = "The employment year is required")
    @Digits(integer = 4, fraction = 0)
    @Pattern(regexp = "^(/YYYY)$" )
    private Integer employmentYear ;

    @NotNull(message = "The annual leave is required")
    @Digits(integer = 4, fraction = 0)
    private Integer annualLeave;



}
