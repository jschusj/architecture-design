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

}
