package dev.java.futFlow;
import dev.java.futFlow.Clubes.ClubeModel;
import dev.java.futFlow.Clubes.ClubeRepository;
import dev.java.futFlow.Jogadores.JogadorDTO;
import dev.java.futFlow.Jogadores.JogadorMapper;
import dev.java.futFlow.Jogadores.JogadorModel;
import dev.java.futFlow.Jogadores.Posicao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class JogadorMapperTest {

    @Mock
    private ClubeRepository clubeRepository;

    @InjectMocks
    private JogadorMapper jogadorMapper;

    @Test
    void deveMapearDtoParaModelComClubeExistente() {
        // Arrange
        ClubeModel clube = new ClubeModel();
        clube.setId(1L);
        clube.setNomeClube("Santos FC");

        JogadorDTO dto = new JogadorDTO();
        dto.setNome("Neymar Jr");
        dto.setEmail("neymar@email.com");
        dto.setIdade(34);
        dto.setNumeroDaCamisa(10);
        dto.setPosicao(Posicao.MEI);
        dto.setClubeId(1L);

        when(clubeRepository.findById(1L)).thenReturn(Optional.of(clube));

        // Act
        JogadorModel resultado = jogadorMapper.map(dto);

        // Assert
        assertThat(resultado.getNome()).isEqualTo("Neymar Jr");
        assertThat(resultado.getClube()).isNotNull();
        assertThat(resultado.getClube().getNomeClube()).isEqualTo("Santos FC");
    }

    @Test
    void deveLancarExcecaoQuandoClubeNaoExiste() {
        // Arrange
        JogadorDTO dto = new JogadorDTO();
        dto.setNome("Jogador Sem Clube");
        dto.setClubeId(99L);

        when(clubeRepository.findById(99L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThatThrownBy(() -> jogadorMapper.map(dto))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Clube não encontrado");
    }

    @Test
    void deveMapearModelParaDto() {
        // Arrange
        ClubeModel clube = new ClubeModel();
        clube.setId(1L);
        clube.setNomeClube("Santos FC");

        JogadorModel model = new JogadorModel();
        model.setId(1L);
        model.setNome("Neymar Jr");
        model.setEmail("neymar@email.com");
        model.setIdade(34);
        model.setNumeroDaCamisa(10);
        model.setPosicao(Posicao.MEI);
        model.setClube(clube);

        // Act
        JogadorDTO resultado = jogadorMapper.map(model);

        // Assert
        assertThat(resultado.getNome()).isEqualTo("Neymar Jr");
        assertThat(resultado.getClubeId()).isEqualTo(1L);
    }
}