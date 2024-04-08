package br.com.ada.estacionamento.vagas;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VagaService {

    @Autowired
    private VagaRepository vagaRepository;

    public void atualizarVaga(Vaga vaga) {
        vagaRepository.save(vaga);
    }

    @PostConstruct
    public void criarVagas(){
        for (int i = 0; i < 10; i++){
            vagaRepository.save(new Vaga());
        }
    }



}