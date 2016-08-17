package com.AcademicWork;

/**
 * Created by Administrator on 2016-08-17.
 */
public class Monster {

    public int x;
    public int y;

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void moveMonster(Player player, Monster monster) {
        monster.x =  monster.x > player.x ? monster.x - 1 : monster.x;
        monster.y =  monster.y > player.y ? monster.y - 1 : monster.y;
        monster.x =  monster.x < player.x ? monster.x + 1 : monster.x;
        monster.y =  monster.y < player.y ? monster.y + 1 : monster.y;
    }
}
