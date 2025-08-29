package com.simentalfilo.dmtbkts.animal.mapper;

import com.simentalfilo.dmtbkts.animal.dto.AnimalDto;
import com.simentalfilo.dmtbkts.animal.entity.Animal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-29T17:16:12+0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.50.v20250729-0351, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public AnimalDto toDto(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalDto animalDto = new AnimalDto();

        animalDto.setBirthDate( animal.getBirthDate() );
        animalDto.setBreed( animal.getBreed() );
        animalDto.setEarTag( animal.getEarTag() );
        animalDto.setFarmId( animal.getFarmId() );
        animalDto.setGender( animal.getGender() );
        animalDto.setId( animal.getId() );

        return animalDto;
    }

    @Override
    public Animal toEntity(AnimalDto dto) {
        if ( dto == null ) {
            return null;
        }

        Animal animal = new Animal();

        animal.setBirthDate( dto.getBirthDate() );
        animal.setBreed( dto.getBreed() );
        animal.setEarTag( dto.getEarTag() );
        animal.setFarmId( dto.getFarmId() );
        animal.setGender( dto.getGender() );
        animal.setId( dto.getId() );

        return animal;
    }
}
