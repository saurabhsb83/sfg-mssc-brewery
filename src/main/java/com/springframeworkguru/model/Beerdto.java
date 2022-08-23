package com.springframeworkguru.model;


import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Beerdto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
