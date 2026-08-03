package dev.java.futFlow.Jogadores;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;
    private JogadorMapper jogadorMapper;

    public JogadorService(JogadorRepository jogadorRepository, JogadorMapper jogadorMapper) {
        this.jogadorRepository = jogadorRepository;
        this.jogadorMapper = jogadorMapper;
    }

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO){
        JogadorModel jogador = jogadorMapper.map(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return jogadorMapper.map(jogador);
    }

    public List<JogadorDTO> listarJogadores(){
        List<JogadorModel> jogadores = jogadorRepository.findAll();
        return jogadores.stream()
                .map(jogadorMapper::map)
                .collect(Collectors.toList());
    }

    public JogadorDTO listarJogadoresPorId(Long id){
        Optional<JogadorModel> jogadorPorId = jogadorRepository.findById(id);
        return jogadorPorId.map(jogadorMapper::map).orElse(null);

    }

    public JogadorDTO alterarJogador(Long id, JogadorDTO jogadorDTO){
        Optional<JogadorModel> alterarJogador = jogadorRepository.findById(id);
        if (alterarJogador.isPresent()) {
            JogadorModel jogadorAtualizado = jogadorMapper.map(jogadorDTO);
            jogadorAtualizado.setId(id);
            JogadorModel jogador = jogadorRepository.save(jogadorAtualizado);
            return jogadorMapper.map(jogador);
        }
        return null;
    }

    public void deletarJogador(Long id){
         jogadorRepository.deleteById(id);
        System.out.println("Ninja DELETADO!");
    }



}
