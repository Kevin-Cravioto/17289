package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class SaludarControlador {
    String nombre;

    @GetMapping("/saludos")
    public String saludar(){
        nombre();
        return "hola mundo! " + nombre;
    }

    @GetMapping("/despedidas")
    public String despedirse(){
        return "adios mundo!";
    }

    @PostMapping("/nombramientos")
    public void nombre(){
        nombre="kvn";
    }

    @PutMapping("/nombramientos")
    public void met1(){
        nombre = "nombre actualizar";
    }

    @DeleteMapping("/nombramientos")
    public void met2(){
        nombre = "";
    }
}