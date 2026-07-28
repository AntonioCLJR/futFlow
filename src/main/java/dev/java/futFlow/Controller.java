package dev.java.futFlow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas")
public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";

}

}
