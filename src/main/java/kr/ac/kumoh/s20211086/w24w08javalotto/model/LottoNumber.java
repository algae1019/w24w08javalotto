package kr.ac.kumoh.s20211086.w24w08javalotto.model;

import java.util.Arrays;

public class LottoNumber
{
    private final int[] numbers;

    public LottoNumber(int[] numbers)
    {
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public int[] getNumbers()
    {
        return Arrays.copyOf(numbers, numbers.length);
    }
}
