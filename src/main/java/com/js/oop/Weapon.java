package com.js.oop;

import lombok.Data;

/**
 * 武器
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:52
 */
@Data
public class Weapon {
    int damage;
    int damageType; //  // 0 - physical, 1 - fire, 2 - ice etc.
    String name;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
