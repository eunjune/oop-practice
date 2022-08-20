package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Money;
import com.example.ooppractice.movie.Screening;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
