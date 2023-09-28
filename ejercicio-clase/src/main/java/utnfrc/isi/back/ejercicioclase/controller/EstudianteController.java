package utnfrc.isi.back.ejercicioclase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utnfrc.isi.back.ejercicioclase.model.Estudiante;
import utnfrc.isi.back.ejercicioclase.service.EstudianteService;

import java.util.Collections;

@RestController
public class EstudianteController {

    private EstudianteService svc;

    @Autowired
    public EstudianteController(EstudianteService svc) {
        this.svc = svc;
    }

    @GetMapping("/estudiante/{legajo}")
    public Estudiante getEstudiante(@PathVariable("legajo") int legajo) {
        return new Estudiante(legajo, "unNombre", "unApellido");
    }

    @GetMapping("/estudiante")
    public Estudiante[] getAll() {
        return svc.listar();
    }

    @PostMapping("/estudiante")
    public String addEstudiante(@RequestBody Estudiante estudiante) {
        return estudiante.toString();
    }
}
