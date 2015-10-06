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
        String resp;
        int resp2 = 0;
        while (resp2 != 2) {
            System.out.println("Кидає гравець 1");
            resp = scanner.nextLine();
            int kub1 = random.nextInt(6) + 1;
            int kub2 = random.nextInt(6) + 1;
            System.out.println(kub1 + "     " + kub2 + "     " + (kub1 + kub2));
            System.out.println("Кидає гравець 2");
            resp = scanner.nextLine();
            int kub3 = random.nextInt(6) + 1;
            ;
            int kub4 = random.nextInt(6) + 1;
            System.out.println(kub3 + "     " + kub4 + "     " + (kub3 + kub4));
            if (kub1 + kub2 > kub3 + kub4) {
                System.out.println("Переможець гравець 1");
            }
             else if (kub1 + kub2 == kub3 + kub4) {
                System.out.println("Нічия");
            } else {
                System.out.println("Переможець гравець 2");
            }
            System.out.println("Якщо хочете зупинитися 2");
            resp2 = Integer.parseInt(scanner.nextLine());
            //push me
        }
    }
}
