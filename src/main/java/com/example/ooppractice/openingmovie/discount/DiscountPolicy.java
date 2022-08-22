package com.example.ooppractice.openingmovie.discount;

import com.example.ooppractice.openingmovie.Money;
import com.example.ooppractice.openingmovie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
