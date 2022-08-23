package com.example.ooppractice.movie;

import com.example.ooppractice.openingmovie.Money;

import java.time.Duration;

public class AmountDiscountMovie extends Movie{
    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee, Money discountAmount, DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountAmount;
    }
}
