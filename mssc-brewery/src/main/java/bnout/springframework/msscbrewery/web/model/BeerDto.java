package bnout.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//DATA MODEL

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BeerDto {
    private int id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
