package com.example.apiRelacion.Service;

import com.example.apiRelacion.entidades.Auto;
import com.example.apiRelacion.reposiorio.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    private AutoRepository autoRepository; // Quitamos el modificador estático

    @Autowired // Inyectamos el AutoRepository correctamente
    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public List<Auto> getAllcar() {
        return autoRepository.findAll();
    }

    public Auto createCar(Auto auto) {
        return autoRepository.save(auto);
    }

    public Auto updateCar(Auto auto) {
        return autoRepository.save(auto);
    }

    public void deleteCar(Integer id) {
        autoRepository.deleteById(id);
    }
}
