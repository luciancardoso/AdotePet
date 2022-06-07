package br.com.treinaweb.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.adoteumpet.api.pet.dtos.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.services.PetService;


@RestController
public class PetController {

    // colocando esse petRepository como um atributo da minha class controller
    @Autowired // estou criando um ponto de injerção de dependencias 
    private PetService petService;

    /* Esse método findAll. ele é um método que tem que ser executado, quando a aplicação receber uma
     * requisição do tipo ( Get ) em um determinado EndPoint, uma determinada ( Rota ) - quando acessar localhosts:8080/pets
     * esse método vai ser executado, ele vai lá no banco de dados atráveis do meu PetRepository fazer a busca de todos os pets
     * cadastrados e então retorna-los e por fim ele vai retorna essa lista de pets na minha respostas.
     */
    @GetMapping("/api/pets")
    public List<PetResponse> findAll(){
        return petService.findAll();
    }
    
}
