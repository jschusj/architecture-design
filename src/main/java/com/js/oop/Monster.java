package com.js.oop;

import lombok.Data;

/**
 * 怪物
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:55
 */
@Data
public class Monster {

    public String name;

    public Long health;

    public void receiveDamageBy(Weapon weapon, Player player) {
        this.health -= weapon.getDamage(); // 基础规则
    }

}
