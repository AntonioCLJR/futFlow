package dev.java.futFlow.Clubes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClubeController {

    public String BoasVindasClubes(){
        return "Seja bem vindo ao FutFlow, aqui você pode cadastrar o time!";
    }

}
