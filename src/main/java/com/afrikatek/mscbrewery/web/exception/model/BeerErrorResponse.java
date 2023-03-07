package com.afrikatek.mscbrewery.web.exception.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/06 at 21:07:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerErrorResponse {
    private Integer status;
    private String message;
    private List<String> violations;
}
