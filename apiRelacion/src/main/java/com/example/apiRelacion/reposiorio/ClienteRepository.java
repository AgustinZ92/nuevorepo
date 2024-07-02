package com.example.apiRelacion.reposiorio;

import com.example.apiRelacion.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
