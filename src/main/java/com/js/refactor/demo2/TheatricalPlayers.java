package com.js.refactor.demo2;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:55
 */
public class TheatricalPlayers {
    private final InvoiceCalculator totalAmountCalculator;
    private final InvoiceCalculator volumeCreditsCalculator;
    private final ResultFormatter resultFormatter;

    public TheatricalPlayers(InvoiceCalculator totalAmountCalculator, InvoiceCalculator volumeCreditsCalculator, ResultFormatter resultFormatter) {
        this.totalAmountCalculator = totalAmountCalculator;
        this.volumeCreditsCalculator = volumeCreditsCalculator;
        this.resultFormatter = resultFormatter;
    }

    public String print(Invoice invoice) {
        int totalAmount = totalAmountCalculator.calculate(invoice);
        int volumeCredits = volumeCreditsCalculator.calculate(invoice);
        return resultFormatter.format(invoice, totalAmount, volumeCredits);
    }
}

