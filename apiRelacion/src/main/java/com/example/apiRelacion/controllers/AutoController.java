package com.example.apiRelacion.controllers;

import com.example.apiRelacion.entidades.Auto;
import com.example.apiRelacion.Service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/autos")
public class AutoController {

    private final AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping("/getAuto")
    public List<Auto> listarTodo() {
        return autoService.getAllcar();
    }

    @PostMapping("/savetAuto")
    public Auto crear(@RequestBody Auto auto) {
        return autoService.createCar(auto);
    }

    @PutMapping("/editar/{id}")
    public Auto actualizar(@RequestBody Auto auto, @PathVariable Integer id) {
        auto.setIdAuto(id);
        return autoService.updateCar(auto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        autoService.deleteCar(id);
    }
}
