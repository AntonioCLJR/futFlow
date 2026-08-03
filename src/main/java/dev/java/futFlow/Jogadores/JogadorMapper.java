package dev.java.futFlow.Jogadores;

import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {

    public JogadorModel map(JogadorDTO jogadorDTO) {
        JogadorModel jogadorModel = new JogadorModel();
        jogadorModel.setId(jogadorDTO.getId());
        jogadorModel.setNome(jogadorDTO.getNome());
        jogadorModel.setEmail(jogadorDTO.getEmail());
        jogadorModel.setIdade(jogadorDTO.getIdade());
        jogadorModel.setNacionalidade(jogadorDTO.getNacionalidade());
        jogadorModel.setNumeroDaCamisa(jogadorDTO.getNumeroDaCamisa());
        jogadorModel.setPosicao(jogadorDTO.getPosicao());
        jogadorModel.setClube(jogadorDTO.getClube());
        return  jogadorModel;
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
        jogadorDTO.setClube(jogadorModel.getClube());
        return jogadorDTO;
    }
}
