package dev.java.futFlow.Jogadores;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/boasVindas")
    public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";
}

    @PostMapping("/criar")
    public JogadorModel criarJogador(@RequestBody JogadorModel jogador){
        return jogadorService.criarJogador(jogador);
}

    @GetMapping("/listar")
    public List<JogadorModel> mostrarTodosJogadores(){
        return jogadorService.listarJogadores();
}

    @GetMapping("/listar/{id}")
    public  JogadorModel listarJogadorPorId(@PathVariable Long id){
        return jogadorService.listarJogadoresPorId(id);
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
