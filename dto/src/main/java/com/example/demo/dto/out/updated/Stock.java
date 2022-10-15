package com.example.demo.dto.out.updated;

import com.example.demo.dto.enums.State;
import com.example.demo.dto.out.Shoe;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Stock {

    private List<Shoe> shoes;

    private State state;
}
