package com.afrikatek.mscbrewery.web.mappers;

import com.afrikatek.mscbrewery.domain.Customer;
import com.afrikatek.mscbrewery.web.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/07 at 18:41:03
 */
@Mapper
public interface CustomerMapper {
    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
