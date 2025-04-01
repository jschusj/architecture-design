package com.js.oop;

/**
 * 龙
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:58
 */
public class Dragon extends Monster {

    public Dragon(String name, Long health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void receiveDamageBy(Weapon weapon, Player player) {
        if (player instanceof Dragoon) {
            this.setHealth(this.getHealth() - weapon.getDamage() * 2); // 龙骑伤害规则
        }
        // else no damage, 龙免疫力规则
    }
}
