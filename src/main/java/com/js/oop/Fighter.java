package com.js.oop;

import com.js.oop.parent.Player;
import lombok.AllArgsConstructor;

/**
 * 战士
 *
 * @Author：YangTao
 * @Date：2025/4/1 19:53
 */
@AllArgsConstructor
public class Fighter extends Player {

    private String name;

    private Sword weapon;

    public Fighter(String name) {
        this.name = name;
    }
}
