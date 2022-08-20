package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Money;
import com.example.ooppractice.movie.Screening;

public class NoneDefaultDiscountPolicy extends DefaultDiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return  Money.ZERO;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
