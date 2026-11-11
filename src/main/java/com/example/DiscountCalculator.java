package com.example;

public class DiscountCalculator {
    public double calculateFinalPrice(double originalPrice, double discountPercent) {
        if (!Double.isFinite(originalPrice) || originalPrice < 0) {
            throw new IllegalArgumentException("Price must be a nonnegative finite number");
        }
        if (!Double.isFinite(discountPercent) || discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        return originalPrice * (1 - discountPercent / 100);
    }
}
