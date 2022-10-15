package com.example.demo.dto.out.updated;


import com.example.demo.dto.in.ShoeFilter.Color;
import com.example.demo.dto.out.updated.newShoe.newShoeBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;

@Value
@Builder
@JsonDeserialize(builder = newShoeBuilder.class)
public class newShoe {

    private Color color;
    private BigInteger size;
    private BigInteger quantity;


    @JsonPOJOBuilder(withPrefix = "")
    public static class newShoeBuilder {

        private Color color;
        private BigInteger size;
        private BigInteger quantity;

        public newShoeBuilder color (Color color) {
            this.color = color;
            return this;
        }


        public newShoeBuilder size (BigInteger size) {
            this.size = size;
            return this;
        }

        public newShoeBuilder quantity(BigInteger quantity) {
            this.quantity = quantity;
            return this;
        }



        public newShoe build() {
            return new newShoe(color, size, quantity);
        }

    }
}
