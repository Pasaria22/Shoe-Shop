package com.example.demo.dto.out.v2;

import com.example.demo.dto.out.v2.NewShoes.newShoesBuilder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@JsonDeserialize(builder = newShoesBuilder.class)
public class NewShoes {

    private List<NewShoe> shoes;

    @JsonPOJOBuilder(withPrefix = "")
    public static class newShoesBuilder {

        private List<NewShoe> shoes;

        public newShoesBuilder shoes(List<NewShoe> shoes) {
            this.shoes = shoes;
            return this;
        }

        public NewShoes build() {
            return new NewShoes(shoes);
        }
    }
}