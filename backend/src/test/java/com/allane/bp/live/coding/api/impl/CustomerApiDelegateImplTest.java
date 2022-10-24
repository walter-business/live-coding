package com.allane.bp.live.coding.api.impl;

import com.allane.bp.live.coding.api.api.CustomerApiDelegate;
import com.allane.bp.live.coding.api.model.CustomerDTO;
import com.allane.bp.live.coding.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {CustomerApiDelegateImpl.class})
class CustomerApiDelegateImplTest {

    @Autowired
    private CustomerApiDelegate underTest;

    @MockBean
    private CustomerService customerService;

    @Test
    void getCustomerForId_Success() throws Exception {
        //prepare
        when(this.customerService.getCustomerForId(any())).thenReturn(new CustomerDTO());

        // test
        var result = this.underTest.getCustomerForId(1L);

        // assert
        assertThat(result).isNotNull();
    }
}