package com.cherepakha.homework7;

public class Action {
    public static void main(String[] args) {
        Participant human = new Human("human1");
        Participant cat = new Cat("cat1");
        Participant robot = new Robot("robot1");

        Let runningTrack = new RunningTrack();
        Let wall = new Wall();

        /*
        5. Наладить взаимодействие между Участником и Препятствием.
        Другими словами, участники при прохождении через препятствия должны выполнять соответствующие действия (бежать или прыгать).
        Например: Человек пробежал беговую дорожку.
         */
        interaction(human, cat, robot, runningTrack, wall);
        System.out.println();

        /*
        6. Создайте два массива: с участниками и препятствиями.
        7. Каждый элемент из массива с участниками должен пройти каждое препятствие из массива с препятствиями.
         */
        arraysLetAndParticipant(human, cat, robot, runningTrack, wall);
        System.out.println();


        Participant secondHuman = new Human("secondHuman", 1900, 2100);
        Participant secondCat = new Cat("secondCat", 2155.5, 1565);
        Participant secondRobot = new Robot("secondRobot", 2005.1, 2100);
        Participant[] array = {secondHuman, secondCat, secondRobot};


        RunningTrack baseRunningTrack = new RunningTrack("Беговая дорожка", 2000);
        Wall baseWall = new Wall("Стена", 1600);

        /*
        8. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        Если участник не смог пройти одно из препятствий, то к следующему он не приступает (полностью выбывает из участия в серии препятствий).
         */
        boolean[][] arrayPass = passingWithLimits(secondHuman, secondCat, secondRobot, baseRunningTrack, baseWall);
        System.out.println();

        /*
        9. * Результат выполнения участником конкретного препятствия выводить в консоль. Например: "Участник[ИМЯ] прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]"
        "Участник[ИМЯ] не прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]. Пройдено[ЗНАЧЕНИЕ]"
         */
        outputOnDisplay(arrayPass, array, baseRunningTrack, baseWall);


    }

    public static void outputOnDisplay(boolean[][] arrayPass, Participant[] array, RunningTrack baseRunningTrack, Wall baseWall) {
        Let[] lets = new Let[2];
        lets[0] = baseWall;
        lets[1] = baseRunningTrack;
        for (int i = 0; i < arrayPass.length; i++) {
            for (int j = 0; j < arrayPass[i].length; j++) {
                if (j == 0) {
                    if (arrayPass[i][j] == true) {
                        System.out.println("Участник " + array[i].getName() + ". Прошёл препятствие \n" +
                                lets[j].getName() + " на дистанции " + baseWall.getHeight() + "м.");
                    } else {
                        System.out.println("Участник " + array[i].getName() + ". НЕ прошёл препятствие \n" +
                                lets[j].getName() + " на дистанции " + baseWall.getHeight() + "м. Пройденно \n" +
                                array[i].getJumpingLimit() + ". Выбыл из соревнования.");
                        break;

                    }
                } else {
                    if (arrayPass[i][j] == true) {
                        System.out.println("Участник " + array[i].getName() + ". Прошёл препятствие \n" +
                                lets[j].getName() + " на дистанции " + baseRunningTrack.getLength() + "м.");
                    } else {
                        System.out.println("Участник " + array[i].getName() + ". НЕ прошёл препятствие \n" +
                                lets[j].getName() + " на дистанции " + baseRunningTrack.getLength() + ". Пройденно " + array[i].getRunningRestriction() + "м.");
                    }

                }
            }
        }
    }

    public static void arraysLetAndParticipant(Participant human, Participant cat, Participant robot, Let runningTrack, Let wall) {
        Participant[] participant = new Participant[3];
        participant[0] = human;
        participant[1] = cat;
        participant[2] = robot;

        Let[] lets = new Let[2];
        lets[0] = wall;
        lets[1] = runningTrack;

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (j == 1) {
                    participant[i].run();
                    lets[j].overcome();
                } else {
                    participant[i].jump();
                    lets[j].overcome();
                }
            }
        }
    }

    public static void interaction(Participant human, Participant cat, Participant robot, Let runningTrack, Let wall) {
        human.jump();
        wall.overcome();

        cat.jump();
        wall.overcome();

        robot.run();
        runningTrack.overcome();
    }

    public static boolean[][] passingWithLimits(Participant human, Participant cat, Participant robot, RunningTrack runningTrack, Wall wall) {

        Participant[] participant = new Participant[3];
        participant[0] = human;
        participant[1] = cat;
        participant[2] = robot;

        Let[] lets = new Let[2];
        lets[0] = wall;
        lets[1] = runningTrack;

        boolean[][] arrayPass = new boolean[3][2];


        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (j == 0) {
                    if (participant[i].getJumpingLimit() >= wall.getHeight()) {
                        arrayPass[i][j] = true;
                    } else if (participant[i].getJumpingLimit() < wall.getHeight()) {
                        arrayPass[i][j] = false;
                        break;
                    }
                } else {
                    if (participant[i].getRunningRestriction() >= runningTrack.getLength()) {
                        arrayPass[i][j] = true;
                    } else {
                        arrayPass[i][j] = false;
                        break;
                    }

                }

            }
        }
        return arrayPass;

    }
}




