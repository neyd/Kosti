package com.neyd.Kosti;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Женя on 06.10.2015.
 */
public class Kosti {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String resp = null;
        String resp2 = null;
        String gamer1 = null;
        String gamer2 = null;
        System.out.println("Введіть ім'я гравця 1");
        gamer1 = scanner.nextLine();
        System.out.println("Введіть ім'я гравця 2");
        gamer2 = scanner.nextLine();
        while (true) {
            System.out.println("Кидає " + gamer1);
            scanner.nextLine();
            int kub1 = random.nextInt(6) + 1;
            int kub2 = random.nextInt(6) + 1;
            System.out.println(kub1 + "     " + kub2 + "     " + (kub1 + kub2));
            System.out.println();
            System.out.println("Кидає " + gamer2);
            scanner.nextLine();
            int kub3 = random.nextInt(6) + 1;
            int kub4 = random.nextInt(6) + 1;
            System.out.println(kub3 + "     " + kub4 + "     " + (kub3 + kub4));
            System.out.println();
            if (kub1 + kub2 > kub3 + kub4) {
                System.out.println("Переможець " + gamer1);
            } else if (kub1 + kub2 == kub3 + kub4) {
                System.out.println("Нічия");
            } else {
                System.out.println("Переможець " + gamer2);
            }
            System.out.println("Якщо хочете зупинитися 2,");
            resp2 = scanner.nextLine();
            if (resp2.equals("2")){
                break;
            }
        }
    }
}
