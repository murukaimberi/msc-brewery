package com.afrikatek.mscbrewery.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/07 at 18:32:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;

}
