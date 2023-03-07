package com.afrikatek.mscbrewery.web.model;

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
 * created on 2023/02/08 at 06:04:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    @Null
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100, message = "Customer name should be between 3 and 100 characters")
    private String name;
}
