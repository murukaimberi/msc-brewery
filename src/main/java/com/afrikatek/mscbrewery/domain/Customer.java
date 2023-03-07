package com.afrikatek.mscbrewery.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/07 at 18:39:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
