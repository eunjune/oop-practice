package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
