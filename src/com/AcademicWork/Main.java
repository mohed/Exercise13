package com.AcademicWork;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        // write your code here
//
//        Door[] doors = {new Door(), new Door(), new Door(), new Door()};
//        Tire[] wheels = {new Tire(), new Tire(), new Tire(), new Tire()};
//        Car car = new Car(1000, wheels, doors);
//
//        System.out.println(car.GetWeight());


        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();

        Player player = new Player(10, 10);
        Monster monster = new Monster(5,5);

        System.out.println("Game over");
        while (true) {

            updateScreen(player, monster, terminal);
            MovePlayer.movePlayer(player, terminal);
            Monster.moveMonster(player, monster);

            if  ((player.x - monster.x) == 0 && (player.y - monster.y) == 0){
                printToTerminal("Game over", terminal);
                break;
            }
        }
    }

    private static void printToTerminal(String s, Terminal terminal) {
        terminal.clearScreen();
        terminal.moveCursor(5, 5);
        for (int i = 0; i < s.length(); i++) {
            terminal.putCharacter(s.charAt(i));
            terminal.moveCursor(5+i, 5);
        }
    }

    private static void updateScreen(Player player, Monster monster, Terminal terminal) {
        terminal.clearScreen();
        terminal.moveCursor(player.x, player.y);
        terminal.putCharacter('O');
        terminal.moveCursor(monster.x, monster.y);
        terminal.putCharacter('X');
        terminal.moveCursor(0, 0);
    }
}