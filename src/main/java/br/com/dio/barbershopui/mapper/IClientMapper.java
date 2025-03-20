package br.com.dio.barbershopui.mapper;

import br.com.dio.barbershopui.controller.request.SaveClientRequest;
import br.com.dio.barbershopui.controller.request.UpdateClientRequest;
import br.com.dio.barbershopui.controller.response.ClientDetailResponse;
import br.com.dio.barbershopui.controller.response.ListClientResponse;
import br.com.dio.barbershopui.controller.response.SaveClientResponse;
import br.com.dio.barbershopui.controller.response.UpdateClientResponse;
import br.com.dio.barbershopui.model.ClientModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientModel toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientModel entity);

    @Mapping(target = "schedules", ignore = true)
    ClientModel toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientModel entity);

    ClientDetailResponse toDetailResponse(final ClientModel entity);

    List<ListClientResponse> toListResponse(final List<ClientModel> entities);

}