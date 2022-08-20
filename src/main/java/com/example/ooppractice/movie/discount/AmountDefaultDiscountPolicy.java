package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Money;
import com.example.ooppractice.movie.Screening;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
