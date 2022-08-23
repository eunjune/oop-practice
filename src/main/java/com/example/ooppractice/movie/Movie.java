package com.example.ooppractice.movie;

import com.example.ooppractice.openingmovie.Money;
import com.example.ooppractice.openingmovie.discount.DiscountPolicy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<PeriodCondition> periodConditions;
    private List<SequenceCondition> sequenceConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy DiscountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
    }

    private Money calculateDiscountAmount() {
        switch (movieType) {
            case AMOUNT_DISCOUNT:
                return calculateAmountDiscountedFee();
            case PERCENT_DISCOUNT:
                return calculatePercentDiscountedFee();
            case NONE_DISCOUNT:
                return calculateNoneDiscountedFee();
        }

        throw new IllegalStateException();
    }

    public Money calculateAmountDiscountedFee() {
        return discountAmount;
    }

    public Money calculatePercentDiscountedFee() {
        return fee.times(discountPercent);
    }

    public Money calculateNoneDiscountedFee() {
        return Money.ZERO;
    }

    public Money calculateMovieFee(Screening screening) {
        if(isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    public boolean isDiscountable(Screening screening) {
        return checkPeriodConditions(screening) || checkSequenceConditions(screening);
    }

    private boolean checkPeriodConditions(Screening screening) {
        return periodConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private boolean checkSequenceConditions(Screening screening) {
        return sequenceConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }
}
