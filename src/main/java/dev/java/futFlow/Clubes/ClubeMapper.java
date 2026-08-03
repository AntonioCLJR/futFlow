package dev.java.futFlow.Clubes;

import org.springframework.stereotype.Component;

@Component
public class ClubeMapper {

    public ClubeModel map(ClubeDTO clubeDTO) {
        ClubeModel clubeModel = new ClubeModel();
        clubeModel.setId(clubeDTO.getId());
        clubeModel.setNomeClube(clubeDTO.getNomeClube());
        clubeModel.setPais(clubeDTO.getPais());
        clubeModel.setFederacao(clubeDTO.getFederacao());
        clubeModel.setAnoDeCriacao(clubeDTO.getAnoDeCriacao());
        clubeModel.setJogador(clubeDTO.getJogador());
        clubeModel.setCampeonatoNacional(clubeDTO.getCampeonatoNacional());
        return  clubeModel;
    }

    public ClubeDTO map(ClubeModel clubeModel) {
        ClubeDTO clubeDTO = new ClubeDTO();
        clubeDTO.setId(clubeModel.getId());
        clubeDTO.setNomeClube(clubeModel.getNomeClube());
        clubeDTO.setPais(clubeModel.getPais());
        clubeDTO.setFederacao(clubeModel.getFederacao());
        clubeDTO.setAnoDeCriacao(clubeModel.getAnoDeCriacao());
        clubeDTO.setJogador(clubeModel.getJogador());
        clubeDTO.setCampeonatoNacional(clubeModel.getCampeonatoNacional());
        return clubeDTO;
    }

}
