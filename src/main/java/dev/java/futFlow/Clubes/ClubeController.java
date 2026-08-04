package dev.java.futFlow.Clubes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clubes")
public class ClubeController {

    private final ClubeService clubeService;

    public ClubeController(ClubeService clubeService, ClubeMapper clubeMapper) {
        this.clubeService = clubeService;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarClube(@RequestBody ClubeDTO clube){
        ClubeDTO clubeDTO = clubeService.criarClube(clube);
         return ResponseEntity.status(HttpStatus.CREATED).body("Clube Criado com sucesso: " + clubeDTO.getNomeClube());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ClubeDTO>> mostrarClubes(){
        List<ClubeDTO> clubes = clubeService.listarClubes();
        if (clubes.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return  ResponseEntity.ok(clubes);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> mostrarClubePorId(@PathVariable Long id){
        ClubeDTO clube = clubeService.listarClubePorId(id);
        if (clubeService.listarClubePorId(id) != null){
            return ResponseEntity.ok().body(clube);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O clube com o ID: " + id + " não foi encontrado!");
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarClube(@PathVariable Long id, @RequestBody ClubeDTO clubeDTO){
        if (clubeService.listarClubePorId(id) != null){
            clubeService.alterarClube(id, clubeDTO);
            return ResponseEntity.ok("Clube Alterado com sucesso!");
        } else  {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O clube com o ID: " + id + " não foi encontrado!");
        }
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarClube(@PathVariable Long id){
        if (clubeService.listarClubePorId(id) != null){
            clubeService.deletarClube(id);
            return ResponseEntity.ok("Clube removido com sucesso!");
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O Clube com o ID: " + id + " não foi encontrado!");
        }
    }

}
