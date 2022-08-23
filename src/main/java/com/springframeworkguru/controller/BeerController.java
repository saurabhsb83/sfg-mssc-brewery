package com.springframeworkguru.controller;


import com.springframeworkguru.model.Beerdto;
import com.springframeworkguru.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;

import java.net.http.HttpResponse;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beers")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/{id}")
    public ResponseEntity<Beerdto> getBeerById(@PathVariable Integer id) {

        return new ResponseEntity<>(beerService.getBeerById(),
                HttpStatus.OK);

    }


    @PostMapping("/")
    public ResponseEntity addBeer(@RequestBody Beerdto beerdto) {

        beerdto.setId(UUID.randomUUID());
        Beerdto beerdto1 = beerService.addBeer(beerdto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beers" + beerdto1.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
}
