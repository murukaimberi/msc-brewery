package com.afrikatek.mscbrewery.web.mappers;

import com.afrikatek.mscbrewery.domain.Beer;
import com.afrikatek.mscbrewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/07 at 18:34:18
 */
@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDTO(Beer beer);
    Beer beerDTOToBeer(BeerDTO beerDTO);
}
