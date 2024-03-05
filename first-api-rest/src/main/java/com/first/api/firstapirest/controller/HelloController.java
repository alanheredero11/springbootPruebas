package com.first.api.firstapirest.controller;

import com.first.api.firstapirest.service.ProductoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/hello")
    public String saludar() {
        return
                "Hola Mundo con REST en SpringBoot";
    }

    @GetMapping("/suma")
    public String sumar(
            @RequestParam int num_1,
            @RequestParam int num_2
    ) {
        return "El resultado es igual a: " + (num_1 + num_2);
    };

    @GetMapping("/resta")
    public String restar(
            @RequestParam int num_1,
            @RequestParam int num_2
    ) {
        return "El resultado es igual a: " + (num_1 - num_2);
    }

    @GetMapping("/multiplicar")
    public String multiplicar(
            @RequestParam int num_1,
            @RequestParam int num_2
    ) {
        return "El resultado es igual a: " + (num_1 * num_2);
    }

    @GetMapping("/dividir")
    public String dividir(
            @RequestParam int num_1,
            @RequestParam int num_2
    ) {
        return "El resultado es igual a: " + (num_1 / num_2);
    }

    @GetMapping("/mayor")
    public String mayor(
            @RequestParam int num_1,
            @RequestParam int num_2
    ) {
        if(num_1 > num_2) {
            return "El mayor de los dos numeros indicados: " + num_1;
        } else if (num_1 == num_2) {
            return "Los dos numero són iguales";
        } else {
            return "El mayor de los dos numeros indicados: " + num_2;
        }
    }




}
