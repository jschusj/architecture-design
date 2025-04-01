package com.js.refactor.demo3;

/**
 * @Author：YangTao
 * @Date：2025/3/12 23:00
 */
public class Performance {

    public Integer audience;

    public Play play;

    int calculateAmount() {
        int thisAmount = 40000;
        if (audience > 30) {
            thisAmount += 1000 * (audience - 30);
        }
        return thisAmount;
    }
}
