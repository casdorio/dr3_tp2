package com.carlos.infnet.cliente_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.infnet.cliente_service.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
