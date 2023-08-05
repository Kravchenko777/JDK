package org.lessons.lesson6.home;


import java.util.*;

/**
 * Main класс для запуска Монти Холла в цикле
 */
public class PlayGame {

    public static void main(String[] args) {

        Player gamer = new Player("Игрок", true);
        HashMap<Integer, Boolean> result = new HashMap<>();
        int statisticWin = 0;
        int statisticLoose = 0;
        int step;

        for (step = 0; step<1000; step++) {
            Game game = new Game(gamer, getDoors());

            if (game.round(0).isPrize()){
                result.put(step + 1, true);
            } else result.put(step + 1, false);
        }

        for(Map.Entry<Integer, Boolean> entrySet : result.entrySet()) {
            if (entrySet.getValue() == true) {
                statisticWin++;
            } else {
                statisticLoose++;
            }
        }

        System.out.println("Из " + step + " игр игрок выиграл " + statisticWin);
        System.out.println("Из " + step + " игр игрок проиграл " + statisticLoose);

    }

    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}
