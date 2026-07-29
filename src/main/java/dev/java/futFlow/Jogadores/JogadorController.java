package dev.java.futFlow.Jogadores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JogadorController {

    @GetMapping("/boasVindas")
public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";

}

}
