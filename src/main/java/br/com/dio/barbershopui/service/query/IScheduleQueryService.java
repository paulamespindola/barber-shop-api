package br.com.dio.barbershopui.service.query;

import br.com.dio.barbershopui.model.ScheduleModel;

import java.time.OffsetDateTime;
import java.util.List;

public interface IScheduleQueryService {

    ScheduleModel findById(final long id);

    List<ScheduleModel> findInMonth(final OffsetDateTime startAt, final OffsetDateTime endAt);

    void verifyIfScheduleExists(final OffsetDateTime startAt, final OffsetDateTime endAt);

}