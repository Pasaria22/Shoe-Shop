package com.example.demo.dto.out.updated;

import com.example.demo.dto.out.updated.newShoes.newShoesBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@JsonDeserialize(builder = newShoesBuilder.class)
public class newShoes {

    private List<newShoe> shoes;

    @JsonPOJOBuilder(withPrefix = "")
    public static class newShoesBuilder {

        private List<newShoe> shoes;

        public newShoesBuilder shoes(List<newShoe> shoes) {
            this.shoes = shoes;
            return this;
        }

        public newShoes build() {
            return new newShoes(shoes);
        }
    }
}