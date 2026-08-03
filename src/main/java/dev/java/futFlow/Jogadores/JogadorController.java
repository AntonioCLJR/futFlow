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
    public JogadorDTO criarJogador(@RequestBody JogadorDTO jogador){
        return jogadorService.criarJogador(jogador);
}

    @GetMapping("/listar")
    public List<JogadorDTO> mostrarTodosJogadores(){
        return jogadorService.listarJogadores();
}

    @GetMapping("/listar/{id}")
    public  JogadorDTO listarJogadorPorId(@PathVariable Long id){
        return jogadorService.listarJogadoresPorId(id);
}

    @PutMapping("/alterar/{id}")
    public JogadorDTO alterarID(@PathVariable Long id, @RequestBody JogadorDTO jogadorDTO){
        return jogadorService.alterarJogador(id, jogadorDTO);
}

    @DeleteMapping("/deletar/{id}")
    public void deletarJogador(@PathVariable Long id){ jogadorService.deletarJogador(id); }
}

