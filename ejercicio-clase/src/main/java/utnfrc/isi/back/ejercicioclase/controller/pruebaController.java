package utnfrc.isi.back.ejercicioclase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

public class pruebaController {
    @GetMapping("/alive")
    public String isAlive() {
        return "I'm alive";
    }

    @GetMapping("/echo/{cadena}")
    public String echo(@PathVariable("cadena") String cadena) {
        return cadena + " " + cadena;
    }

    @GetMapping("/echoo")
    public String echoo(@RequestParam("cadena") String cadena, @RequestParam("cantidad") String cantidad) {
        var n = (cantidad != null) ? Integer.parseInt(cantidad) : 0;
        return String.join("", Collections.nCopies(n, cadena + " "));
    }
}
