package dev.java.futFlow.Clubes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClubeService {

    private final ClubeRepository clubeRepository;
    private final ClubeMapper clubeMapper;

    public ClubeService(ClubeRepository clubeRepository, ClubeMapper clubeMapper) {
        this.clubeRepository = clubeRepository;
        this.clubeMapper = clubeMapper;
    }

    public ClubeDTO criarClube(ClubeDTO clubeDTO){
        ClubeModel clube = clubeMapper.map(clubeDTO);
        clube = clubeRepository.save(clube);
        return clubeMapper.map(clube);
    }

    public List<ClubeDTO> listarClubes(){
        return clubeRepository.findAll()
                .stream()
                .map(clubeMapper::map)
                .collect(Collectors.toList());
    }

    public ClubeDTO listarClubePorId(Long id){
        Optional<ClubeModel> clubePorId = clubeRepository.findById(id);
        return clubePorId.map(clubeMapper::map).orElse(null);
    }

    public ClubeModel buscarClubeModelPorId(Long id){
        return clubeRepository.findById(id).orElse(null);
    }

    public ClubeDTO alterarClube(Long id, ClubeDTO clubeDTO){
        Optional<ClubeModel> clubeExistente = clubeRepository.findById(id);
        if (clubeExistente.isPresent()) {
            ClubeModel clubeAtualizado = clubeMapper.map(clubeDTO);
            clubeAtualizado.setId(id);
            ClubeModel clube = clubeRepository.save(clubeAtualizado);
            return clubeMapper.map(clube);
        }
        return null;
    }

    public void deletarClube(Long id){
        clubeRepository.deleteById(id);
    }
}