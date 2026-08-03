package dev.java.futFlow.Jogadores;

import dev.java.futFlow.Clubes.ClubeModel;
import dev.java.futFlow.Clubes.ClubeRepository;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    private ClubeRepository clubeRepository;

    public JogadorMapper(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    public JogadorModel map(JogadorDTO jogadorDTO) {
        JogadorModel jogadorModel = new JogadorModel();
        jogadorModel.setId(jogadorDTO.getId());
        jogadorModel.setNome(jogadorDTO.getNome());
        jogadorModel.setEmail(jogadorDTO.getEmail());
        jogadorModel.setIdade(jogadorDTO.getIdade());
        jogadorModel.setNacionalidade(jogadorDTO.getNacionalidade());
        jogadorModel.setNumeroDaCamisa(jogadorDTO.getNumeroDaCamisa());
        jogadorModel.setPosicao(jogadorDTO.getPosicao());

        ClubeModel clube = clubeRepository.findById(jogadorDTO.getClubeId())
                .orElseThrow(() -> new RuntimeException("Clube não encontrado com id: " + jogadorDTO.getClubeId()));
        jogadorModel.setClube(clube);

        return jogadorModel;
    }

    public JogadorDTO map(JogadorModel jogadorModel) {
        JogadorDTO jogadorDTO = new JogadorDTO();
        jogadorDTO.setId(jogadorModel.getId());
        jogadorDTO.setNome(jogadorModel.getNome());
        jogadorDTO.setEmail(jogadorModel.getEmail());
        jogadorDTO.setIdade(jogadorModel.getIdade());
        jogadorDTO.setNacionalidade(jogadorModel.getNacionalidade());
        jogadorDTO.setNumeroDaCamisa(jogadorModel.getNumeroDaCamisa());
        jogadorDTO.setPosicao(jogadorModel.getPosicao());
        jogadorDTO.setClubeId(jogadorModel.getClube().getId());
        return jogadorDTO;
    }
}
