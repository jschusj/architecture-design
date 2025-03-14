package com.js.refactor.demo3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:55
 */
public class TheatricalPlayers {

    public String print(Invoice invoice) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String result = String.format("Statement for %s\n", invoice.customer);
        result += String.format("Amount owed is %s\n", format.format(invoice.calculateTotalAmount() / 100));
        result += String.format("You earned %s credits\n", invoice.calculateVolumeCredits());
        return result;
    }
}

