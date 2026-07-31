package dev.java.futFlow.Jogadores;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @GetMapping("/boasVindas")
public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";
}

@PostMapping("/criar")
    public String criarJogador(){
        return "Jogador Criado!";
}

@GetMapping("/listar")
    public String mostrarTodosJogadores(){
        return  "Todos";
}

@GetMapping("/listarID")
    public  String mostrarTodosJogadoresID(){
        return  "Todos ID";
}

@PutMapping("/alterar")
    public String alterarID(){
        return  "Alterar ID";
}

@DeleteMapping("/deletar")
    public  String deletarJogador(){
        return   "Deletar Jogador";
}
}
