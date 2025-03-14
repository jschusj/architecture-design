package com.js.refactor.demo2;

/**
 * @Author：YangTao
 * @Date：2025/3/12 23:16
 */
public class VolumeCreditsCalculator {
    int calculate(Invoice invoice) {
        int volumeCredits = 0;
        for (Performance perf : invoice.performances) {
            int thisCredits = Math.max(perf.audience - 30, 0);
            if ("comedy".equals(perf.play.type)) {
                thisCredits += Math.floor((double) perf.audience / 5);
            }
            volumeCredits += thisCredits;
        }
        return volumeCredits;
    }
}
