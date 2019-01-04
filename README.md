# eureka-service-discover
Testando o Service Discovery Eureka com Spring Cloud Netflix.


## microservices-eureka-server
Contem o Service Registry que mantem atualizado todas as instâcias dos micro-services.

## microservices-eureka-client
Exemplo de Service Provider ( micro-service) que retorna um usuario, e que se registra no Service Registry.

## microservices-eureka-client-consumer
Exemplo de Service Consumer, que registra-se no Service Registry e a partir dele recupera os endereço para consomir dados do Service Provider.


## Executar o projeto
O projeto foi desenvolvido utilizando o Spring Boot e o maven como gerenciador de dependência, para executar e só baixar e executar como spring boot app.

