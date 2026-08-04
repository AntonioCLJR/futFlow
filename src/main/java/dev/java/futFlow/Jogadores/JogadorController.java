package dev.java.futFlow.Jogadores;
import dev.java.futFlow.Clubes.ClubeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarJogador(@RequestBody JogadorDTO jogador){
        JogadorDTO jogadorDTO = jogadorService.criarJogador(jogador);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Jogador Criado com sucesso: " + jogadorDTO.getNome() + "| ID: " + jogadorDTO.getId());


}

    @GetMapping("/listar")
    public ResponseEntity<List<JogadorDTO>> mostrarTodosJogadores(){
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        if (jogadores.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return  ResponseEntity.ok(jogadores);
}

    @GetMapping("/listar/{id}")
    public  ResponseEntity<?> listarJogadorPorId(@PathVariable Long id){
        JogadorDTO jogador = jogadorService.listarJogadoresPorId(id);
        if (jogadorService.listarJogadoresPorId(id) != null){
            return ResponseEntity.ok().body(jogador);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O jogador com o ID: " + id + " não foi encontrado!");
        }

}

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarID(@PathVariable Long id, @RequestBody JogadorDTO jogadorDTO){
        if (jogadorService.listarJogadoresPorId(id) != null){
             jogadorService.alterarJogador(id, jogadorDTO);
             return ResponseEntity.ok("Jogador Alterado com sucesso!");
        } else  {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O jogador com o ID: " + id + " não foi encontrado!");
        }
}

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarJogador(@PathVariable Long id){
        if (jogadorService.listarJogadoresPorId(id) != null){
            jogadorService.deletarJogador(id);
            return ResponseEntity.ok("Jogador removido com sucesso!");
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O jogador com o ID: " + id + " não foi encontrado!");
        }
    }
}

