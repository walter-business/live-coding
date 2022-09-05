package com.allane.bp.live.coding.api.impl;

import com.allane.bp.live.coding.api.api.CustomerApiDelegate;
import com.allane.bp.live.coding.api.model.CustomerDTO;
import com.allane.bp.live.coding.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerApiDelegateImpl implements CustomerApiDelegate {

    private final CustomerService customerService;

    @Override
    public ResponseEntity<CustomerDTO> getCustomerForId(Long id) {
        return ResponseEntity.ok(this.customerService.getCustomerForId(id));
    }
}
