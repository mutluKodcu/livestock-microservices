package com.simentalfilo.dmtbkts.finance.mapper;

import com.simentalfilo.dmtbkts.finance.dto.FinancialRecordDto;
import com.simentalfilo.dmtbkts.finance.entity.FinancialRecord;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-29T17:16:15+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250729-0351, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class FinancialMapperImpl implements FinancialMapper {

    @Override
    public FinancialRecordDto toDto(FinancialRecord entity) {
        if ( entity == null ) {
            return null;
        }

        FinancialRecordDto financialRecordDto = new FinancialRecordDto();

        financialRecordDto.setAmount( entity.getAmount() );
        financialRecordDto.setAnimalId( entity.getAnimalId() );
        financialRecordDto.setDate( entity.getDate() );
        financialRecordDto.setDescription( entity.getDescription() );
        financialRecordDto.setId( entity.getId() );
        financialRecordDto.setType( entity.getType() );

        return financialRecordDto;
    }

    @Override
    public FinancialRecord toEntity(FinancialRecordDto dto) {
        if ( dto == null ) {
            return null;
        }

        FinancialRecord financialRecord = new FinancialRecord();

        financialRecord.setAmount( dto.getAmount() );
        financialRecord.setAnimalId( dto.getAnimalId() );
        financialRecord.setDate( dto.getDate() );
        financialRecord.setDescription( dto.getDescription() );
        financialRecord.setId( dto.getId() );
        financialRecord.setType( dto.getType() );

        return financialRecord;
    }
}
