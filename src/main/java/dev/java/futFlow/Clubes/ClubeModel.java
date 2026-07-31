package dev.java.futFlow.Clubes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java.futFlow.Jogadores.JogadorModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_clubes")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ClubeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeClube;
    private String federacao;
    private String pais;
    private int anoDeCriacao;
    @OneToMany(mappedBy = "clube") //Um clube pode ter vários jogadores.
    @JsonIgnore
    private List<JogadorModel> jogador;

}

