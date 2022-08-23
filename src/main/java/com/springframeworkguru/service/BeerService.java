package com.springframeworkguru.service;


import com.springframeworkguru.model.Beerdto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerService {

    public Beerdto getBeerById() {

        return new Beerdto(UUID.randomUUID(),
                "Blue moon",
                "Pale Ale",
                123232L);
    }


    public Beerdto addBeer(Beerdto beerdto) {

        return beerdto;

    }
}
