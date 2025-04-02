package com.js.oop;

import com.js.oop.parent.Monster;
import com.js.oop.parent.Player;
import com.js.oop.parent.Weapon;

/**
 * 兽人
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:57
 */
public class Orc extends Monster {

    public Orc(String name, Long health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (weapon.getDamageType() == 0) {
            this.setHealth(this.getHealth() - weapon.getDamage() / 2); // Orc的物理防御规则
        } else {
            super.receiveDamageBy(weapon, player);
        }
    }

}
