package com.example.demo.mapper;

import com.example.demo.model.NewEntityDto;
import com.example.demo.repository.NewEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface NewEntityMapper {
    NewEntity newEntityDtoToNewEntity(NewEntityDto newEntityDto);

    NewEntityDto newEntityToNewEntityDto(NewEntity newEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateNewEntityFromNewEntityDto(NewEntityDto newEntityDto, @MappingTarget NewEntity newEntity);
}
