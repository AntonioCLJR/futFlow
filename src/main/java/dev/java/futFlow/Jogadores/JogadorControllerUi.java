package dev.java.futFlow.Jogadores;

import dev.java.futFlow.Clubes.ClubeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/jogadores/ui")
public class JogadorControllerUi {

    private final JogadorService jogadorService;
    private final ClubeRepository clubeRepository;

    public JogadorControllerUi(JogadorService jogadorService, ClubeRepository clubeRepository) {
        this.jogadorService = jogadorService;
        this.clubeRepository = clubeRepository;
    }

    @GetMapping("/listar")
    public String mostrarTodosJogadores(Model model) {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        model.addAttribute("jogadores", jogadores);
        return "listarJogadores";
    }

    @GetMapping("/detalhes/{id}")
    public String mostrarDetalhesJogador(@PathVariable Long id, Model model) {
        JogadorModel jogador = jogadorService.buscarJogadorModelPorId(id);
        if (jogador == null) {
            return "redirect:/jogadores/ui/listar";
        }
        model.addAttribute("jogador", jogador);
        return "detalhesJogador";
    }

    @GetMapping("/adicionar")
    public String mostrarFormularioAdicionar(Model model) {
        model.addAttribute("novoJogador", new JogadorDTO());
        model.addAttribute("clubes", clubeRepository.findAll());
        model.addAttribute("posicoes", Posicao.values());
        return "adicionarJogador";
    }

    @PostMapping("/adicionar")
    public String processarFormularioAdicionar(@ModelAttribute("novoJogador") JogadorDTO jogadorDTO) {
        jogadorService.criarJogador(jogadorDTO);
        return "redirect:/jogadores/ui/listar";
    }

    @GetMapping("/alterar/{id}")
    public String mostrarFormularioAlterar(@PathVariable Long id, Model model) {
        JogadorDTO jogador = jogadorService.listarJogadoresPorId(id);
        if (jogador == null) {
            return "redirect:/jogadores/ui/listar";
        }
        model.addAttribute("jogadorEditado", jogador);
        model.addAttribute("clubes", clubeRepository.findAll());
        model.addAttribute("posicoes", Posicao.values());
        return "alterarJogador";
    }

    @PostMapping("/alterar/{id}")
    public String processarFormularioAlterar(@PathVariable Long id, @ModelAttribute("jogadorEditado") JogadorDTO jogadorDTO) {
        jogadorService.alterarJogador(id, jogadorDTO);
        return "redirect:/jogadores/ui/detalhes/" + id;
    }

    @GetMapping("/deletar/{id}")
    public String deletarJogador(@PathVariable Long id) {
        jogadorService.deletarJogador(id);
        return "redirect:/jogadores/ui/listar";
    }
}