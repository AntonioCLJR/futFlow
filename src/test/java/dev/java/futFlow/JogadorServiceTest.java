package dev.java.futFlow;

import dev.java.futFlow.Jogadores.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JogadorServiceTest {

    @Mock
    private JogadorRepository jogadorRepository;

    @Mock
    private JogadorMapper jogadorMapper;

    @InjectMocks
    private JogadorService jogadorService;

    private JogadorModel jogadorModel;
    private JogadorDTO jogadorDTO;

    @BeforeEach
    void setUp() {
        jogadorModel = new JogadorModel();
        jogadorModel.setId(1L);
        jogadorModel.setNome("Neymar Jr");
        jogadorModel.setEmail("neymar@email.com");
        jogadorModel.setIdade(34);
        jogadorModel.setNumeroDaCamisa(10);
        jogadorModel.setPosicao(Posicao.MEI);

        jogadorDTO = new JogadorDTO();
        jogadorDTO.setId(1L);
        jogadorDTO.setNome("Neymar Jr");
        jogadorDTO.setEmail("neymar@email.com");
        jogadorDTO.setIdade(34);
        jogadorDTO.setNumeroDaCamisa(10);
        jogadorDTO.setPosicao(Posicao.MEI);
        jogadorDTO.setClubeId(1L);
    }
    @Test
    void deveCriarJogadorComSucesso(){
        when(jogadorMapper.map(jogadorDTO)).thenReturn(jogadorModel);
        when(jogadorRepository.save(jogadorModel)).thenReturn(jogadorModel);
        when(jogadorMapper.map(jogadorModel)).thenReturn(jogadorDTO);
        JogadorDTO resultado = jogadorService.criarJogador(jogadorDTO);
        assertThat(resultado).isNotNull();
        verify(jogadorRepository).save(any(JogadorModel.class));
    }
    @Test
    void naoDeveAlterarJogadorQuandoIdNaoExiste(){
        when(jogadorRepository.findById(10000L)).thenReturn(Optional.empty());
        JogadorDTO resultado = jogadorService.alterarJogador(10000L, jogadorDTO);
        assertThat(resultado).isNull();
        verify(jogadorRepository, never()).save(any(JogadorModel.class));
    }
    @Test
    void deveDeletarJogadorPeloId(){
        jogadorService.deletarJogador(1L);
        verify(jogadorRepository, times(1)).deleteById(1L);
    }

}
