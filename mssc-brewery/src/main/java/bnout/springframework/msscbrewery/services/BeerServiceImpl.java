package bnout.springframework.msscbrewery.services;


import org.springframework.stereotype.Service;

import bnout.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    int id =1 ;
    @Override
    public BeerDto getBeerById(int beerId) {
        // TODO Auto-generated method stub
        /* builder() é utilizado para construir o objeto BeerDto
         * build() é utilizado para construir o objeto
        */
        return BeerDto.builder().id(id)
                .beerName("Galaxy cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto savedNewBeer(String beerDto) {

        return BeerDto.builder()
                .id(id)
                .beerName(beerDto)
                .build();
    }
}
