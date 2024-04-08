## Sistema de Controle de Estacionamento 
## Desafio da entrevista de empregabilidade da Ada Tech(https://github.com/Ada-Empregabilidade/entrevista-tecnica-back-end-java-desafio-estacionamento)
- Você faz parte do time que construirá um sistema de controle para um estacionamento.
 - Você foi imcumbido de implementar a funcionalidade 'estacionar' que recebe 
 - como parametro um carro previamente cadastrado no sistema e a vaga para qual ele se destina.
▪️​ Um carro não pode ser estacIonado em uma vaga que já esteja ocupada.
▪️​ Uma vez que todas as vagas estejam ocupadas não deve ser permitida a entreda de novos carros
Implementar método que retira o carro da  vaga.
### Este é um projeto que implementa um sistema de controle para um estacionamento, permitindo cadastrar carros e estacioná-los em vagas disponíveis.

### Funcionalidades Implementadas
###  Cadastro de Carro: Permite cadastrar um novo carro no sistema, informando a placa, marca e modelo do veículo.

## Estacionamento de Carro: Permite estacionar um carro em uma vaga disponível, 
garantindo que a vaga não esteja ocupada. Se todas as vagas estiverem ocupadas, não será permitida a entrada de novos carros.


### Endpoints Disponíveis

- **POST /carros:** Este endpoint é usado para cadastrar um novo carro no sistema.
- Envie um JSON contendo os dados do carro (placa, marca, modelo) no corpo da solicitação.
-URL:[ /carros](http://localhost:9090/carros)
    Método HTTP: POST
Corpo da Requisição (JSON):
json
Copy code
{
  "placa": "ABC1234",
  "marca": "Volkswagen",
  "modelo": "Gol"
}
 

- **POST /carros/estacionar:** Este endpoint é usado para estacionar um carro em uma vaga disponível.
- Envie um JSON contendo os dados do carro (placa, marca, modelo) e a vaga desejada no corpo da solicitação.
- Se o estacionamento for bem-sucedido, o carro será associado à vaga especificada.

- URL: [/carros/estacionar](http://localhost:8080/carros/estaciona)
Método HTTP: POST
Corpo da Requisição (JSON):
json
Copy code
{
  "placa": "ABC1234",
  "vaga": {
    "numero": 1,
    "ocupada": false
  }
}
Resposta de Sucesso:
Status: 200 OK
Corpo da Resposta (JSON):
json
Copy code
{
  "placa": "ABC1234",
  "marca": "Volkswagen",
  "modelo": "Gol"
}
Resposta de Falha:
Status: 400 Bad Request
Corpo da Resposta (JSON):


- **POST /carros/retirar:** Este endpoint é usado para retirar um carro do estacionamento.
- Envie um JSON contendo os dados do carro (placa, marca, modelo) no corpo da solicitação.
- Se a retirada for bem-sucedida, o carro será removido da vaga.
- http://localhost:9090/carros/retirar
- {
    "placa": "ABC1234",
    "marca": "Toyota",
    "modelo": "Corolla",
    "vaga": {
        "numero": 1,
        "ocupada": false
    }
}
  ![image](https://github.com/teofilonicolau/desafio_springboot_ada/assets/97030160/2eb343e7-25bb-4cd6-83a2-41bd85892d0d)


Tecnologias Utilizadas
Java
Spring Boot
Hibernate
H2 Database
Maven
