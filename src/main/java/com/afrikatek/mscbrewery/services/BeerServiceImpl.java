package com.afrikatek.mscbrewery.services;

import com.afrikatek.mscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 05:50:30
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("Chibuku")
                .beerStyle("Masese")
                .build();
    }

    @Override
    public BeerDTO createBear(BeerDTO beerDTO) {
        return BeerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
