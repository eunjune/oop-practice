package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Money;
import com.example.ooppractice.movie.Screening;
import com.example.ooppractice.movie.discount.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }


    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    };

    abstract protected Money getDiscountAmount(Screening screening);


}
