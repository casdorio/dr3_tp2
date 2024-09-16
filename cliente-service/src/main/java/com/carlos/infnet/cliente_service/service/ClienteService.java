package com.carlos.infnet.cliente_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.infnet.cliente_service.model.Cliente;
import com.carlos.infnet.cliente_service.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }


    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

}
