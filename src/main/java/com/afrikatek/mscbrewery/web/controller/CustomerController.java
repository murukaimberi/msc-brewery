package com.afrikatek.mscbrewery.web.controller;

import com.afrikatek.mscbrewery.services.CustomerService;
import com.afrikatek.mscbrewery.web.model.BeerDTO;
import com.afrikatek.mscbrewery.web.model.CustomerDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/02/08 at 06:07:19
 */
@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable UUID customerId){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerById(customerId));
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody CustomerDTO customerDTO){
        CustomerDTO savedCustomerDTO = customerService.createCustomer(customerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + savedCustomerDTO.getId());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @PutMapping("/{customerId}")
    public ResponseEntity handleUpdate(@Valid @PathVariable UUID customerId, @RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(customerId, customerDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID customerId){
        customerService.deleteCustomerById(customerId);
    }


}
