package br.com.dio.barbershopui.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.barbershopui.model.ClientModel;

@Repository
public interface IClientRepository extends JpaRepository<ClientModel, Long> {

    boolean existsByEmail(final String email);

    boolean existsByPhone(final String phone);

    Optional<ClientModel> findByEmail(final String email);

    Optional<ClientModel> findByPhone(final String phone);

}