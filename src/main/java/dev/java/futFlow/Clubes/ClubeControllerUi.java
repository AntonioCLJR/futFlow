package dev.java.futFlow.Clubes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clubes/ui")
public class ClubeControllerUi {

    private final ClubeService clubeService;

    public ClubeControllerUi(ClubeService clubeService) {
        this.clubeService = clubeService;
    }

    @GetMapping("/listar")
    public String mostrarTodosClubes(Model model) {
        List<ClubeDTO> clubes = clubeService.listarClubes();
        model.addAttribute("clubes", clubes);
        return "listarclubes";
    }

    @GetMapping("/detalhes/{id}")
    public String mostrarDetalhesClube(@PathVariable Long id, Model model) {
        ClubeModel clube = clubeService.buscarClubeModelPorId(id);
        if (clube == null) {
            return "redirect:/clubes/ui/listar";
        }
        model.addAttribute("clube", clube);
        return "detalhesclube";
    }

    @GetMapping("/adicionar")
    public String mostrarFormularioAdicionar(Model model) {
        model.addAttribute("novoClube", new ClubeDTO());
        return "adicionarclube";
    }

    @PostMapping("/adicionar")
    public String processarFormularioAdicionar(@ModelAttribute("novoClube") ClubeDTO clubeDTO) {
        clubeService.criarClube(clubeDTO);
        return "redirect:/clubes/ui/listar";
    }

    @GetMapping("/alterar/{id}")
    public String mostrarFormularioAlterar(@PathVariable Long id, Model model) {
        ClubeDTO clube = clubeService.listarClubePorId(id);
        if (clube == null) {
            return "redirect:/clubes/ui/listar";
        }
        model.addAttribute("clubeEditado", clube);
        return "alterarclube";
    }

    @PostMapping("/alterar/{id}")
    public String processarFormularioAlterar(@PathVariable Long id, @ModelAttribute("clubeEditado") ClubeDTO clubeDTO) {
        clubeService.alterarClube(id, clubeDTO);
        return "redirect:/clubes/ui/detalhes/" + id;
    }

    @GetMapping("/deletar/{id}")
    public String deletarClube(@PathVariable Long id) {
        clubeService.deletarClube(id);
        return "redirect:/clubes/ui/listar";
    }
}