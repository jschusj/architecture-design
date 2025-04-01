package com.js.oop;

import lombok.Data;

/**
 * 玩家
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:52
 */
@Data
public abstract class Player {

    public String name;

    Weapon weapon;

    public void attack(Monster monster) {
        monster.receiveDamageBy(weapon, this);
    }
}
