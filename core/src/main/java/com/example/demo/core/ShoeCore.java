package com.example.demo.core;

import com.example.demo.dto.in.ShoeFilter;
import com.example.demo.dto.in.ShoesIn;
import com.example.demo.dto.out.Shoes;
import com.example.demo.dto.out.v2.Stock;

public interface ShoeCore {

  Shoes search(ShoeFilter filter);

  Stock findAllStock();

  ShoesIn patchStock(ShoesIn shoesIn);

}
