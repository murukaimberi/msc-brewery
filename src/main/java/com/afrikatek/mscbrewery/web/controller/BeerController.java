package com.afrikatek.mscbrewery.web.controller;

import com.afrikatek.mscbrewery.services.BeerService;
import com.afrikatek.mscbrewery.web.model.BeerDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 05:43:30
 */
@RestController
@RequestMapping("/api/v1/beer")
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId){
        return ResponseEntity.status(HttpStatus.OK).body(beerService.getBeerById(beerId));
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDTO beerDTO){
        BeerDTO savedBeerDTO = beerService.createBear(beerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeerDTO.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, @RequestBody BeerDTO beerDTO){
        beerService.updateBeer(beerId, beerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID beerId){
        beerService.deleteBeerById(beerId);
    }
}
