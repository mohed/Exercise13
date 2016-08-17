package com.AcademicWork;

import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

/**
 * Created by Administrator on 2016-08-17.
 */
public class MovePlayer {

    public static void movePlayer(Player player, Terminal terminal) throws InterruptedException {
        //Wait for a key to be pressed
        Key key;
        do {
            Thread.sleep(5);
            key = terminal.readInput();
        } while (key == null);


        switch (key.getCharacter()) {
            case 'U': if (player.y > 0){
                player.y--;
            }
                break;
            case 'D': if (player.y < 20){
                player.y++;
            }
                break;
            case 'L':
                if (player.x > 0) {
                    player.x--;
                }
                break;
            case 'R':
                if (player.x < 20) {
                    player.x++;
                }
                break;
        }
        System.out.println(key.getCharacter() + " " + key.getKind());
    }
}
