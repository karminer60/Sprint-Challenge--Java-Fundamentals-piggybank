package com.lambdaschool.piggybank.controllers;
import java.util.*;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

    @Autowired
    CoinRepository coinrepos;
    // http://localhost:2019/total

    @GetMapping(value = "/total",
    produces = {"application/json"})
    public ResponseEntity<?>listAllCoins()
    {
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((c1,c2)-> c1.getName().compareToIgnoreCase(c2.getName()));
        System.out.println(myList);
        for( Coin item: myList){
            System.out.format("", item);


        }
        return new ResponseEntity<>(myList, HttpStatus.OK);

    }
}
