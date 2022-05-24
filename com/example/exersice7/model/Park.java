package com.example.exersice7.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Constraint;
import javax.validation.constraints.*;

@AllArgsConstructor @Data
public class Park {

    @NotNull(message = "The id is required")
    @Min(value = 2, message = "Length of id must be more than 2")
    private Integer rideID;

    @NotNull(message = "The name is required")
    @Size(min = 4, max = 20, message = "name must be between 4-20 character")
    private String rideName;

    @NotNull(message = "The ride type is required")
    @Pattern(regexp = "^(Rollercoaster|thriller|water)$")
    private String rideType;

    @NotNull(message = "The ticket is required")
    @Digits(integer = 10, fraction = 0)
    private Integer tickets;

    @NotNull(message = "The price is required")
    @Digits(integer = 10, fraction = 0)
    private Integer price;

}
