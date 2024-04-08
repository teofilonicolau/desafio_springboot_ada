package br.com.ada.estacionamento.carros;

import br.com.ada.estacionamento.vagas.Vaga;
import br.com.ada.estacionamento.vagas.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    public CarroRepository carroRepository;

    @Autowired
    private VagaService vagaService;

    public void cadastrarCarro(Carro carro){
        carroRepository.save(carro);
    }

    public boolean estacionar(Carro carro){
        Vaga vaga = carro.getVaga();
        if (vaga.isOcupada()) {
            return false;
        }
        vaga.setOcupada(true);
        vagaService.atualizarVaga(vaga);
        carroRepository.save(carro);
        return true;
    }

    public void retirarCarro(Carro carro) {
        Vaga vaga = carro.getVaga();
        if (vaga != null) {
            vaga.setOcupada(false);
            carro.setVaga(null);
            vagaService.atualizarVaga(vaga);
            carroRepository.save(carro);
        }
    }

}
