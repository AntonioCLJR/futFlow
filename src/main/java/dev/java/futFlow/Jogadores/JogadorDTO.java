package dev.java.futFlow.Jogadores;
import dev.java.futFlow.Clubes.ClubeModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class JogadorDTO {

    private Long id;
    private String nome;
    private String email;
    private Posicao posicao;
    private String nacionalidade;
    private int numeroDaCamisa;
    private int idade;
    private Long clubeId;
    private String clubeNome;

}