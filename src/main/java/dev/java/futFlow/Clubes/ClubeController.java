package dev.java.futFlow.Clubes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clubes")
public class ClubeController {

    private ClubeService clubeService;

    public ClubeController(ClubeService clubeService, ClubeMapper clubeMapper) {
        this.clubeService = clubeService;
    }

    @PostMapping("/criar")
    public ClubeDTO criarClube(@RequestBody ClubeDTO clube){
        return clubeService.criarClube(clube);
    }

    @GetMapping("/listar")
    public List<ClubeDTO> mostrarClubes(){
        return clubeService.listarClubes();
    }

    @GetMapping("/listar/{id}")
    public ClubeDTO mostrarClubePorId(@PathVariable Long id){
        return clubeService.listarClubePorId(id);
    }

    @PutMapping("/alterar/{id}")
    public ClubeDTO alterarClube(@PathVariable Long id, @RequestBody ClubeDTO clubeDTO){
        return clubeService.alterarClube(id, clubeDTO);
    }
    @DeleteMapping("/deletar/{id}")
    public void deletarClube(@PathVariable Long id){
        clubeService.deletarClube(id);
    }

}
