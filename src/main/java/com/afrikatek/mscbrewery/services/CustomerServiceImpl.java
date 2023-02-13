package com.afrikatek.mscbrewery.services;

import com.afrikatek.mscbrewery.web.model.BeerDTO;
import com.afrikatek.mscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 06:06:27
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

    @Override
    public BeerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }
}
