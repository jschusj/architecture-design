package com.js.oop;

import com.js.oop.parent.Weapon;

/**
 * 法杖
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:53
 */
public class Staff extends Weapon {

    public Staff(String name, int damage) {
        super(name, damage);
        damageType = 2;
    }
}
