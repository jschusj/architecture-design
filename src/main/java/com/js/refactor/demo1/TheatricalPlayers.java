package com.js.refactor.demo1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:55
 */
public class TheatricalPlayers {
    public String print(Invoice invoice) {
        int totalAmount = new TotalAmountCalculator().getTotalAmount(invoice);
        int volumeCredits = new VolumeCreditsCalculator().getVolumeCredits(invoice);
        return getResult(invoice, totalAmount, volumeCredits);
    }

    private String getResult(Invoice invoice, int totalAmount, int volumeCredits) {
        String result = String.format("Statement for %s\n", invoice.customer);
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
