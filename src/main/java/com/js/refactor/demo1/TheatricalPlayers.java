package com.js.refactor.demo1;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:55
 */
public class TheatricalPlayers {
    public String print(Invoice invoice) {
        int totalAmount = new TotalAmountCalculator().getTotalAmount(invoice);
        int volumeCredits = new VolumeCreditsCalculator().getVolumeCredits(invoice);
        return new ResultFormatter().getResult(invoice, totalAmount, volumeCredits);
    }

}
