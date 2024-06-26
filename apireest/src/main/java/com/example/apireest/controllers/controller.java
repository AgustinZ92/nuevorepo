package com.example.apireest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apireest.modelo.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class controller {

    int auto;

    @GetMapping("/names")
    public String holaMundo(){

        return "hola mundo en api rest";
    }
    @GetMapping("/autos")
    public List<auto> getAutos() {
        auto[] autos = new auto[3];

        autos[0] = new auto("Toyota", "Corolla", 2020);
        autos[1] = new auto("Honda", "Civic", 2019);
        autos[2] = new auto("Ford", "Focus", 2018);

        List<auto> listaAutos = new ArrayList<>(Arrays.asList(autos));

        listaAutos.forEach(auto -> {
            auto.setMarca("test");
            auto.setAno(auto.getAno() + 7);
        });

        return List.of(autos);
    }
}
