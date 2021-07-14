package com.example.springbootcachejdk.entity;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Iabur on July 14, 2021.
 */
@Data
@Builder
public class City {
    private String name;
    private String zipCode;
}
