package dev.java.futFlow.Clubes;
import dev.java.futFlow.Jogadores.JogadorModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClubeDTO {

        private Long id;
        private String nomeClube;
        private String federacao;
        private String pais;
        private int anoDeCriacao;
        private List<JogadorModel> jogador;
        private String campeonatoNacional;
    }



