package dev.java.futFlow.Jogadores;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class JogadorController {

    @GetMapping("/boasVindas")
public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";
}

@PostMapping("/adicionarjogador")
    public String criarJogador(){
        return "Jogador Criado!";
}
@GetMapping("/todosjogadores")
    public String mostrarTodosJogadores(){
        return  "Todos";
}

@GetMapping("/todosjogadoresID")
    public  String mostrarTodosJogadoresID(){
        return  "Todos ID";
}

@PutMapping("/alterarjogadorID")
    public String alterarID(){
        return  "Alterar ID";
}
@DeleteMapping("/deletarjogadorID")
    public  String deletarJogador(){
        return   "Deletar Jogador";
}
}
