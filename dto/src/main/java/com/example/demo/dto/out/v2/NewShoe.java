package com.example.demo.dto.out.v2;


import com.example.demo.dto.in.ShoeFilter.Color;
import com.example.demo.dto.out.v2.NewShoe.NewShoeBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = NewShoeBuilder.class)
public class NewShoe {

    private Color color;
    private int size;
    private long quantity;

    @JsonPOJOBuilder(withPrefix = "")
    public static class NewShoeBuilder {

        private Color color;
        private int size;
        private long quantity;

        public NewShoeBuilder color(Color color) {
            this.color = color;
            return this;
        }


        public NewShoeBuilder size(int size) {
            this.size = size;
            return this;
        }

        public NewShoeBuilder quantity(long quantity) {
            this.quantity = quantity;
            return this;
        }


        public NewShoe build() {
            return new NewShoe(color, size, quantity);
        }

    }
}
