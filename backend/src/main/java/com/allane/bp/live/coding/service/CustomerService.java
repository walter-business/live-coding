package com.allane.bp.live.coding.service;

import com.allane.bp.live.coding.api.model.CustomerDTO;
import com.allane.bp.live.coding.mapper.CustomerMapper;
import com.allane.bp.live.coding.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    public CustomerDTO getCustomerForId(Long id) {
        return this.customerRepository
                .findById(id)
                .map(this.customerMapper::toDto)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        String.format("no customer found for id %s", id)
                ));

    }
}
