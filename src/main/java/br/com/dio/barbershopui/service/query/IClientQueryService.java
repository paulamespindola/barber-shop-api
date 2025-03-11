package br.com.dio.barbershopui.service.query;

import java.util.List;

import br.com.dio.barbershopui.model.ClientModel;

public interface IClientQueryService {

    ClientModel findById(final long id);

    List<ClientModel> list();

    void verifyPhone(final String phone);

    void verifyPhone(final long id,final String phone);

    void verifyEmail(final String email);

    void verifyEmail(final long id,final String email);

}