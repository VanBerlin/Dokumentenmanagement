package com.dokuman.dokumentenmangement.mapper;

import com.dokuman.dokumentenmangement.dto.RechnungDto;
import com.dokuman.dokumentenmangement.model.Rechnung;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface RechnungMapper {

    RechnungMapper INSTANCE = Mappers.getMapper(RechnungMapper.class);

    Rechnung dtoToEntity(RechnungDto dto);

    RechnungDto entityToDto(Rechnung rechnung);

    List<RechnungDto> entitiesToDtos(List<Rechnung> entities);

}
