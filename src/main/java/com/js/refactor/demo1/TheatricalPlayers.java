package com.js.refactor.demo1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:55
 */
public class TheatricalPlayers {
    public String print(Invoice invoice) {
        int totalAmount = getTotalAmount(invoice);
        int volumeCredits = getVolumeCredits(invoice);
        return getResult(invoice, totalAmount, volumeCredits);
    }

    private int getTotalAmount(Invoice invoice) {
        int totalAmount = 0;
        for (Performance perf : invoice.performances) {
            totalAmount += getThisAmount(perf);
        }
        return totalAmount;
    }

    private int getThisAmount(Performance perf) {
        int thisAmount = 40000;
        if (perf.audience > 30) {
            thisAmount += 1000 * (perf.audience - 30);
        }
        return thisAmount;
    }
    private int getVolumeCredits(Invoice invoice) {
        int volumeCredits = 0;
        for (Performance perf : invoice.performances) {
            volumeCredits += getThisCredits(perf);
        }
        return volumeCredits;
    }

    private int getThisCredits(Performance perf) {
        int thisCredits = Math.max(perf.audience - 30, 0);
        if ("comedy".equals(perf.play.type)) {
            thisCredits += Math.floor((double) perf.audience / 5);
        }
        return thisCredits;
    }

    private String getResult(Invoice invoice, int totalAmount, int volumeCredits) {
        String result = String.format("Statement for %s\n", invoice.customer);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
