package com.example.apiRelacion.Service;

import com.example.apiRelacion.entidades.Cliente;
import com.example.apiRelacion.reposiorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClients(){
        return clienteRepository.findAll();
    }

    public Cliente createClient(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public Cliente deleteCliente(Integer id){
        clienteRepository.deleteById(id);
        return null;
    }
}
