package br.com.dio.barbershopui.service;

import br.com.dio.barbershopui.model.ScheduleModel;

public interface IScheduleService {

    ScheduleModel save(final ScheduleModel entity);

    void delete(final long id);

}