package com.example.demo.controller;

import com.example.demo.dto.in.ShoeFilter;
import com.example.demo.dto.in.ShoesIn;
import com.example.demo.dto.out.Shoes;
import com.example.demo.dto.out.v2.Stock;
import com.example.demo.facade.ShoeFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/shoes")
@RequiredArgsConstructor
public class ShoeController {

  private final ShoeFacade shoeFacade;

  @GetMapping(path = "/search")
  public ResponseEntity<Shoes> all(@RequestBody ShoeFilter filter, @RequestHeader Integer version){

    return ResponseEntity.ok(shoeFacade.get(version).search(filter));

  }

  @GetMapping(path = "/stock")
  public ResponseEntity<Stock> allStock(@RequestHeader Integer version){

    return ResponseEntity.ok(shoeFacade.get(version).findAllStock());

  }

  @PatchMapping
  public ResponseEntity<ShoesIn> patchStock(@RequestBody ShoesIn shoesIn, @RequestHeader Integer version){
    return ResponseEntity.ok(shoeFacade.get(version).patchStock(shoesIn));
  }

}
