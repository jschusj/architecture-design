package com.js.oop;

import com.js.oop.parent.Weapon;

/**
 * 剑
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:53
 */
public class Sword extends Weapon {

    public Sword(String name, int damage) {
        super(name, damage);
        damageType = 0;
    }
}
