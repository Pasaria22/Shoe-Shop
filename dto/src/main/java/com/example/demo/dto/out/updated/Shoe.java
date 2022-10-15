package com.example.demo.dto.out.updated;


import com.example.demo.dto.in.ShoeFilter.Color;
import com.example.demo.dto.out.updated.Shoe.ShoeUpdateBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;

@Value
@Builder
@JsonDeserialize(builder = ShoeUpdateBuilder.class)
public class Shoe {

    Color color;
    BigInteger size;
    BigInteger quantity;


    @JsonPOJOBuilder(withPrefix = "")
    public static class ShoeUpdateBuilder {

        private Color color;
        private BigInteger size;
        private BigInteger quantity;

        public ShoeUpdateBuilder color (Color color) {
            this.color = color;
            return this;
        }


        public ShoeUpdateBuilder size (BigInteger size) {
            this.size = size;
            return this;
        }

        public ShoeUpdateBuilder quantity(BigInteger quantity) {
            this.quantity = quantity;
            return this;
        }



        public Shoe build() {
            return new Shoe(color, size, quantity);
        }

    }
}
