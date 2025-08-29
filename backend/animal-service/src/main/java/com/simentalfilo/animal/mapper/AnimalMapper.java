package com.simentalfilo.animal.mapper;
import org.mapstruct.Mapper;
import com.simentalfilo.dmtbkts.animal.entity.Animal;
import com.simentalfilo.dmtbkts.animal.dto.AnimalDto;
@Mapper(componentModel = "spring")
public interface AnimalMapper {
  AnimalDto toDto(Animal animal);
  Animal toEntity(AnimalDto dto);
}
