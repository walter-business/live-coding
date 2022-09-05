package com.allane.bp.live.coding.repository;

import com.allane.bp.live.coding.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
