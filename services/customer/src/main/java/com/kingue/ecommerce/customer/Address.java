package com.kingue.ecommerce.customer;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
}
