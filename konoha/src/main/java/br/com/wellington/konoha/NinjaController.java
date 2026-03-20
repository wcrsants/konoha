package br.com.wellington.konoha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/msgTeste")
    public String msgTeste(){
        return "Minha rota está funcionando";
    }
}
