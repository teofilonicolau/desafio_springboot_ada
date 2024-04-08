package br.com.ada.estacionamento.carros;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    public final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @PostMapping("/carros")
    public ResponseEntity<Carro> cadastrarCarro(@RequestBody Carro carro){
        service.cadastrarCarro(carro);
        return ResponseEntity.created(null).body(carro);
    }

    @PostMapping("/carros/estacionar")
    public ResponseEntity<?> estacionar(@RequestBody Carro carro){
        boolean sucesso = service.estacionar(carro);
        if (sucesso) {
            return ResponseEntity.ok(carro);
        } else {
            return ResponseEntity.badRequest().body("Falha ao estacionar o carro. Vaga ocupada.");
        }
    }

    @PostMapping("/carros/retirar")
    public ResponseEntity<?> retirarCarro(@RequestBody Carro carro){
        service.retirarCarro(carro);
        return ResponseEntity.ok(carro);
    }

}


