package com.js.oop;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @Author：YangTao
 * @Date：2025/4/1 20:05
 */
public class BattleTest {

    @Test
    @DisplayName("Dragon is immune to attacks")
    public void testDragonImmunity() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword("Excalibur", 10);
        fighter.setWeapon(sword);
        Dragon dragon = new Dragon("Dragon", 100L);

        // When
        fighter.attack(dragon);

        // Then
        assertThat(dragon.getHealth()).isEqualTo(100);
    }

    @Test
    @DisplayName("Dragoon attack dragon doubles damage")
    public void testDragoonSpecial() {
        // Given
        Dragoon dragoon = new Dragoon("Dragoon");
        Sword sword = new Sword("Excalibur", 10);
        dragoon.setWeapon(sword);
        Dragon dragon = new Dragon("Dragon", 100L);

        // When
        dragoon.attack(dragon);

        // Then
        assertThat(dragon.getHealth()).isEqualTo(100 - 10 * 2);
    }

    @Test
    @DisplayName("Orc should receive half damage from physical weapons")
    public void testFighterOrc() {
        // Given
        Fighter fighter = new Fighter("Hero");
        Sword sword = new Sword("Excalibur", 10);
        fighter.setWeapon(sword);
        Orc orc = new Orc("Orc", 100L);

        // When
        fighter.attack(orc);

        // Then
        assertThat(orc.getHealth()).isEqualTo(100 - 10 / 2);
    }

    @Test
    @DisplayName("Orc receive full damage from magic attacks")
    public void testMageOrc() {
        // Given
        Mage mage = new Mage("Mage");
        Staff staff = new Staff("Fire Staff", 10);
        mage.setWeapon(staff);
        Orc orc = new Orc("Orc", 100L);

        // When
        mage.attack(orc);

        // Then
        assertThat(orc.getHealth()).isEqualTo(100 - 10);
    }

    @Test
    public void testEquip() {
        Fighter fighter = new Fighter("Hero");

        Sword sword = new Sword("Sword", 10);
        fighter.setWeapon(sword);

        Staff staff = new Staff("Staff", 10);
        fighter.setWeapon(staff);

        assertThat(fighter.getWeapon()).isInstanceOf(Sword.class); // 错误了
    }

}
