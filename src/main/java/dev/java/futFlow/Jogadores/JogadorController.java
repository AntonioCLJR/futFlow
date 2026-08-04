package dev.java.futFlow.Jogadores;
import dev.java.futFlow.Clubes.ClubeDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/boasVindas")
    @Operation(summary = "Mensagem de boas vindas", description = "Essa rota da uma mensagem de boas vindas para quem acessa.")
    public String BoasVindas(){
 return "Seja bem vindo ao FutFlow";
}

    @PostMapping("/criar")
    @Operation(summary = "Adiciona um jogador", description = "Essa rota adiciona um novo jogador ao banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="201", description = "Jogador criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na criação do jogador")
    })
    public ResponseEntity<String> criarJogador(@RequestBody JogadorDTO jogador){
        JogadorDTO jogadorDTO = jogadorService.criarJogador(jogador);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Jogador Criado com sucesso: " + jogadorDTO.getNome() + "| ID: " + jogadorDTO.getId());


}

    @GetMapping("/listar")
    @Operation(summary = "Lista todos os jogadores na API", description = "Essa rota lista todos os jogadores que estão no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="200", description = "Jogador encontrado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Jogador não encontrado")
    })
    public ResponseEntity<List<JogadorDTO>> mostrarTodosJogadores(){
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        if (jogadores.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return  ResponseEntity.ok(jogadores);
}

    @GetMapping("/listar/{id}")
    @Operation(summary = "Busca um jogador pelo número do ID", description = "Essa rota busca um jogador utilizando o número do ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="200", description = "Jogador encontrado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Jogador não encontrado")
    })
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
    @Operation(summary = "Altera um jogador por ID", description = "Essa rota altera um jogador utilizando o ID para busca")
    @ApiResponses(value = {
            @ApiResponse(responseCode ="200", description = "Jogador alterado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Não foi possível alterar o jogador")
    })
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

