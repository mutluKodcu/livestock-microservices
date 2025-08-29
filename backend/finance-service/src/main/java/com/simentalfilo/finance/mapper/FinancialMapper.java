package com.simentalfilo.finance.mapper;
import org.mapstruct.Mapper;
import com.simentalfilo.dmtbkts.finance.entity.FinancialRecord;
import com.simentalfilo.dmtbkts.finance.dto.FinancialRecordDto;
@Mapper(componentModel = "spring")
public interface FinancialMapper {
  FinancialRecordDto toDto(FinancialRecord entity);
  FinancialRecord toEntity(FinancialRecordDto dto);
}
