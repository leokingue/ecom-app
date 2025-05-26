package com.kingue.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest (
     String id,
     @NotNull(message = "Customer firstname is Required")
     String firstName,
     @NotNull(message = "Customer lastname is Required")
     String lastName,
     @NotNull(message = "Customer email is Required")
     @Email(message = "Customer email is not a valid email address")
     String email,
     Address address
) {

}
