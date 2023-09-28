package utnfrc.isi.back.ejercicioclase.service;

import org.springframework.stereotype.Service;
import utnfrc.isi.back.ejercicioclase.model.Estudiante;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteService {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante[] listar() {
        Estudiante[] array = new Estudiante[estudiantes.size()];
        estudiantes.toArray(array);
        return array;
    }
}
