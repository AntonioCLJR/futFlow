package dev.java.futFlow.Clubes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clubes")
public class ClubeController {

    @PostMapping("/criar")
    public String criarClube(){
        return "Clube criado com sucesso";
    }

    @GetMapping("/listar")
    public String mostrarClubes(){
        return "Clubes listados com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarClube(){
        return "Clube alterado com sucesso";
    }
    @DeleteMapping("/deletar")
    public String deletarClube(){
        return "Clube deletado com sucesso";
    }

}
