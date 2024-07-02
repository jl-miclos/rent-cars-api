package br.gov.sp.fatec.domain.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = SPRING)
public interface AluguelMapper {
    @Mapping(target = "cliente.id", source = "clienteId")
    @Mapping(target = "carro.id", source = "carroId")
    Aluguel map(AluguelRequest source);

    @Mapping(target = "cliente.id", source = "clienteId")
    @Mapping(target = "carro.id", source = "carroId")
    Aluguel map(AluguelUpdateRequest source);

    AluguelResponse map(Aluguel source);
}
