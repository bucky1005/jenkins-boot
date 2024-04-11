package com.ohgiraffers.bootproject.dto;

import lombok.Data;

@Data
public class CalculatorDTO {
    private int num1;
    private int num2;
    private int sum;

    // num1, num2가 초기화되는 생성자
    public CalculatorDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
