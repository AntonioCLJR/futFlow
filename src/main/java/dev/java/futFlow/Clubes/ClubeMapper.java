package dev.java.futFlow.Clubes;

import org.springframework.stereotype.Component;

@Component
public class ClubeMapper {

    public ClubeModel map(ClubeDTO clubeDTO) {
        ClubeModel clubeModel = new ClubeModel();
        clubeModel.setId(clubeDTO.getId());
        clubeModel.setNomeClube(clubeDTO.getNomeClube());
        clubeModel.setFederacao(clubeDTO.getFederacao());
        clubeModel.setPais(clubeDTO.getPais());
        clubeModel.setAnoDeCriacao(clubeDTO.getAnoDeCriacao());
        clubeModel.setCampeonatoNacional(clubeDTO.getCampeonatoNacional());
        return clubeModel;
    }

    public ClubeDTO map(ClubeModel clubeModel) {
        ClubeDTO clubeDTO = new ClubeDTO();
        clubeDTO.setId(clubeModel.getId());
        clubeDTO.setNomeClube(clubeModel.getNomeClube());
        clubeDTO.setFederacao(clubeModel.getFederacao());
        clubeDTO.setPais(clubeModel.getPais());
        clubeDTO.setAnoDeCriacao(clubeModel.getAnoDeCriacao());
        clubeDTO.setJogador(clubeModel.getJogador());
        clubeDTO.setCampeonatoNacional(clubeModel.getCampeonatoNacional());
        return clubeDTO;
    }
}