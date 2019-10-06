package com.rest.webservices.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Builder
@Data
public class User {
    private UUID id;
    private String name;
    private Date birthDate;

}
