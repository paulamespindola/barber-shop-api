package br.com.dio.barbershopui.service;

import br.com.dio.barbershopui.model.ClientModel;

public interface IClientService {

    ClientModel save(final ClientModel entity);

    ClientModel update(final ClientModel entity);

    void delete(final long id);

}