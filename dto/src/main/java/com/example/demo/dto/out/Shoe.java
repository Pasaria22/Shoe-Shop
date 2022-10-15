package com.example.demo.dto.out;

import com.example.demo.dto.in.ShoeFilter.Color;
import com.example.demo.dto.out.Shoe.ShoeBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.math.BigInteger;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = ShoeBuilder.class)
public class Shoe {

  String     name;
  BigInteger size;
  Color      color;

  @JsonPOJOBuilder(withPrefix = "")
  public static class ShoeBuilder {

    private String name;
    private BigInteger size;
    private Color color;

    public ShoeBuilder name(String name) {
      this.name = name;
      return this;
    }

    public ShoeBuilder size (BigInteger size) {
      this.size = size;
      return this;
    }

    public ShoeBuilder color (Color color) {
      this.color = color;
      return this;
    }

    public Shoe build() {
      return new Shoe(name, size, color);
    }

  }


}
