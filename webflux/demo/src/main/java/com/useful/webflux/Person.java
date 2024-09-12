package com.useful.webflux;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {
    private Integer personId;
    private String firstName;
    private String lastName;
    private Integer age;
}
