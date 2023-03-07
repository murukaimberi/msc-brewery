package com.afrikatek.mscbrewery.services;

import com.afrikatek.mscbrewery.web.model.BeerDTO;
import com.afrikatek.mscbrewery.web.model.CustomerDTO;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 06:05:46
 */
public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteCustomerById(UUID customerId);

    CustomerDTO createCustomer(CustomerDTO customerDTO);
}
