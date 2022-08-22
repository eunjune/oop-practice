package com.example.ooppractice.openingmovie.discount;

import com.example.ooppractice.openingmovie.Money;
import com.example.ooppractice.openingmovie.Screening;

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
