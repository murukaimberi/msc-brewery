package com.afrikatek.mscbrewery.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 05:37:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDTO {
    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc;
}
