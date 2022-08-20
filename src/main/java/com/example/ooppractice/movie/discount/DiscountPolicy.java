package com.example.ooppractice.movie.discount;

import com.example.ooppractice.movie.Money;
import com.example.ooppractice.movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
