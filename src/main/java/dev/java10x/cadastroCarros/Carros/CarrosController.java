package dev.java10x.cadastroCarros.Carros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CarrosController {

    @GetMapping ("/boasvindas")
    public String boasVindas(){

        return "Essa é minha primeira mensagem nessa rota";

    }

}
