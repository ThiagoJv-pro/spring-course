package bnout.springframework.msscbrewery.services;



import bnout.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

//Logica de negocio da minha aplicacao

public interface BeerService {
    BeerDto getBeerById(int id);
    BeerDto savedNewBeer(String beerDto);
}
