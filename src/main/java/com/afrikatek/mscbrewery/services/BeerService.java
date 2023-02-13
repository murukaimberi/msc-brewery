package com.afrikatek.mscbrewery.services;

import com.afrikatek.mscbrewery.web.model.BeerDTO;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 05:49:01
 */

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO createBear(BeerDTO beerDTO);

    void updateBeer(UUID beerId, BeerDTO beerDTO);

    void deleteBeerById(UUID beerId);
}
