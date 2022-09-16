package com.allane.bp.live.coding.mapper;

import com.allane.bp.live.coding.api.model.CustomerDTO;
import com.allane.bp.live.coding.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface CustomerMapper {

    CustomerDTO toDto(CustomerEntity source);

    CustomerEntity toEntity(CustomerDTO source);
}
