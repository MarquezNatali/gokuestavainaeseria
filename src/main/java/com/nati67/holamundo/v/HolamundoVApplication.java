package com.nati67.holamundo.v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolamundoVApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolamundoVApplication.class, args);
    }

    @GetMapping("/hola")
    public String hola(@RequestParam(name = "nombre", defaultValue = "Mundo", required = false) String nombre) {
        return String.format("¡Hola %s!", nombre);
    }
}
