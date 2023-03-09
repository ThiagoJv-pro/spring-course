package bnout.springframework.msscbrewery.web.controller;

import java.util.UUID;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.*;

import bnout.springframework.msscbrewery.services.BeerService;
import bnout.springframework.msscbrewery.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    //construtor/
    private final BeerService beerService;

    public BeerController (BeerService beerService){
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") int beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    @PostMapping("/bto/{beerDto}")
    public ResponseEntity handPost(@PathVariable String beerDto){

        BeerDto savedDto = beerService.savedNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString()); //cabecalho de localizacao https://localhost:8080/beers/123
        return  new ResponseEntity<>(headers, HttpStatus.CREATED); //Com o metodo ResponseEntity, pode-se "Personalizar" o Http reponse, Head e body e personalizar o status http

        /*
Supondo que a solicitação esteja sendo feita para o endpoint "/beers" usando o método POST e que o corpo da solicitação contenha informações sobre uma nova cerveja, o modelo de cabeçalho que seria retornado pelo servidor seria:

HTTP/1.1 201 Created
Location: http://localhost:8080/beers/123
Content-Length: 0

O cabeçalho de resposta contém três campos principais:

Status-Line: indica o status da resposta HTTP, que neste caso é "201 Created".

Location: contém o URI do recurso recém-criado. Neste caso, o servidor está retornando o URI da nova cerveja, que inclui o endpoint "/beers" e o ID gerado pelo banco de dados (123). O URI é incluído no cabeçalho para que o cliente possa facilmente localizar e acessar a nova cerveja.

Content-Length: indica o tamanho do corpo da resposta. Como não há conteúdo no corpo da resposta, o valor é 0.

É importante notar que o cabeçalho de resposta pode conter outros campos, dependendo da implementação do servidor e dos requisitos específicos da aplicação.
* */
    }
    @GetMapping("/bto/{beerDto}")
    public ResponseEntity handPost(@PathVariable String beerDto){

        BeerDto getDto = beerService.getBeerById(1);

        return  new ResponseEntity<>(, HttpStatus.CREATED);
}
    }
