package dev.java.futFlow.Clubes;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ClubeService {

    private ClubeRepository clubeRepository;


    public ClubeService(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    public List<ClubeModel> listarClubes(){
        return clubeRepository.findAll();
    }

    public ClubeModel listarClubePorId(Long id){
        Optional<ClubeModel> clubePorId = clubeRepository.findById(id);
        return clubePorId.orElse(null);
    }

    public ClubeModel criarClube(ClubeModel clube){
        return clubeRepository.save(clube);
    }

    public void deletarClube(@PathVariable Long id){
        clubeRepository.deleteById(id);
    }

}
