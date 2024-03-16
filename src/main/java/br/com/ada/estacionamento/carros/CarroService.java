package br.com.ada.estacionamento.carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {


    public CarroRepository carroRepository;

    public void cadastrarCarro(Carro carro){
        carroRepository.save(carro);
    }

    public void estacionar(Carro carro){
        carroRepository.save(carro);
    }

}
