package dev.java.futFlow.Jogadores;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {

    private JogadorRepository jogadorRepository;
    private JogadorMapper jogadorMapper;

    public JogadorService(JogadorRepository jogadorRepository, JogadorMapper jogadorMapper) {
        this.jogadorRepository = jogadorRepository;
        this.jogadorMapper = jogadorMapper;
    }

    public List<JogadorModel> listarJogadores(){
        return  jogadorRepository.findAll();
    }

    public JogadorModel listarJogadoresPorId(Long id){
        Optional<JogadorModel> jogadorPorId = jogadorRepository.findById(id);
        return jogadorPorId.orElse(null);
    }

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO){
        JogadorModel jogador = jogadorMapper.map(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return jogadorMapper.map(jogador);
    }

    public void deletarJogador(Long id){
         jogadorRepository.deleteById(id);
        System.out.println("Ninja DELETADO!");
    }

    public JogadorModel alterarJogador(Long id, JogadorModel jogadorAtualizado){
        if (jogadorRepository.existsById(id)){
            jogadorAtualizado.setId(id);
            return  jogadorRepository.save(jogadorAtualizado);
        }
        return null;
    }

}
