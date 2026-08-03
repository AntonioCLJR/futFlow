package dev.java.futFlow.Clubes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clubes")
public class ClubeController {

    private ClubeService clubeService;

    public ClubeController(ClubeService clubeService) {
        this.clubeService = clubeService;
    }

    @PostMapping("/criar")
    public ClubeModel criarClube(@RequestBody ClubeModel clube){
        return clubeService.criarClube(clube);
    }

    @GetMapping("/listar")
    public List<ClubeModel> mostrarClubes(){
        return clubeService.listarClubes();
    }

    @GetMapping("/listar/{id}")
    public ClubeModel mostrarClubePorId(@PathVariable Long id){
        return clubeService.listarClubePorId(id);
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
