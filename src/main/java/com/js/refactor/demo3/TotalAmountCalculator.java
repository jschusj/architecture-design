package com.js.refactor.demo3;

/**
 * @Author：YangTao
 * @Date：2025/3/12 23:08
 */
public class TotalAmountCalculator {

    int calculate(Invoice invoice) {
        int totalAmount = 0;
        for (Performance perf : invoice.performances) {
            int thisAmount = 40000;
            if (perf.audience > 30) {
                thisAmount += 1000 * (perf.audience - 30);
            }
            totalAmount += thisAmount;
        }
        return totalAmount;
    }
}
