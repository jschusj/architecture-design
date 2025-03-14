package com.js.refactor.demo3;

import lombok.Data;

import java.util.List;

/**
 * @Author：YangTao
 * @Date：2025/3/12 22:56
 */
@Data
public class Invoice {

    List<Performance> performances; // 确保这个属性存在

    public String customer;

    int calculateTotalAmount() {
        return performances.stream().mapToInt(Performance::calculateAmount).sum();
    }

    int calculateVolumeCredits() {
        int volumeCredits = 0;
        for (Performance perf : performances) {
            int thisCredits = Math.max(perf.audience - 30, 0);
            if ("comedy".equals(perf.play.type)) {
                thisCredits += Math.floor((double) perf.audience / 5);
            }
            volumeCredits += thisCredits;
        }
        return volumeCredits;
    }
}
