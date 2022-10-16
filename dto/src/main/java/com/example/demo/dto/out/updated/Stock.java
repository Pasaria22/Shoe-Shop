package com.example.demo.dto.out.updated;

import com.example.demo.dto.enums.State;
import com.example.demo.dto.out.Shoes;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

import java.util.List;


@Value
@Builder
@JsonDeserialize(builder = Shoes.ShoesBuilder.class)
public class Stock {

    private State state;
    private List<NewShoe> shoes;

    public static class StockBuilder {
        private State state;
        private List<NewShoe> shoes;

        public StockBuilder state (State state) {
            this.state = state;
            return this;
        }

        public StockBuilder shoes (List<NewShoe> shoes) {
            this.shoes = shoes;
            return this;
        }

        public Stock build() {
            return new Stock(state, shoes);
        }
    }
}
