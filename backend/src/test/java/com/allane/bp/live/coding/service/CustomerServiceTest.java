package com.allane.bp.live.coding.service;

import java.util.Optional;

import com.allane.bp.live.coding.entity.CustomerEntity;
import com.allane.bp.live.coding.mapper.CustomerMapper;
import com.allane.bp.live.coding.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @InjectMocks
    private CustomerService underTest;

    @Mock
    private CustomerRepository customerRepository;

    @Spy
    private CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);

    @Test
    void getCustomerForId_found() {
        var customerEntity = new CustomerEntity();
        when(this.customerRepository.findById(any())).thenReturn(Optional.of(customerEntity));

        var result = this.underTest.getCustomerForId(1L);

        assertThat(result).isNotNull().usingRecursiveComparison().isEqualTo(customerEntity);
    }

    @Test
    void getCustomerForId_notFound() {
        when(this.customerRepository.findById(any())).thenReturn(Optional.empty());

        assertThatThrownBy(() -> this.underTest.getCustomerForId(1L))
                .isInstanceOf(ResponseStatusException.class)
                .hasFieldOrPropertyWithValue("status", HttpStatus.NOT_FOUND)
                .hasMessage("404 NOT_FOUND \"no customer found for id 1\"");

    }

}
