package com.afrikatek.mscbrewery.web.controller;

import com.afrikatek.mscbrewery.web.model.BeerDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/06 at 20:44:12
 */
@SpringBootTest
@AutoConfigureMockMvc
public class BeerControllerITest {
    private BeerDTO beerDTO;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @BeforeEach
    void setup(){
        beerDTO = BeerDTO
                .builder()
                .beerName("test beer")
                .beerStyle("Masese")
                .upc(24253436L)
                .build();
    }

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/v1/beer/" + UUID.randomUUID().toString())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
    }

    @Test
    void createBeer() throws  Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer")
                        .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(beerDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void createBeerFailsWhenBeerNameIsNull() throws Exception {
        beerDTO.setBeerName(null);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/beer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(beerDTO)))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.BAD_REQUEST.value()));

    }
}
