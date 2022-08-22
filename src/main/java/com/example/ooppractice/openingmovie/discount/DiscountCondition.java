package com.example.ooppractice.openingmovie.discount;

import com.example.ooppractice.openingmovie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
