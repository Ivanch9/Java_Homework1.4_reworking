package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vp = sc.nextInt(); // Ves podarka
        int va = sc.nextInt(); // Ves apelsina
        int vy = sc.nextInt(); // Ves yabloka
        int vg = sc.nextInt(); // Ves grushi
        int alla = vp / va;
        int ally = vp / vy;
        int allg = vp / vg;
        int count = 0;
        int ai, yi, gi;
        ai = 0;
        for (int i = 0; i <= alla; i++, ai += va) {
            yi = 0;
            for (int j = 0; j <= ally; j++, yi += vy) {
                gi = vp - ai - yi;
                int k = gi / vg;
                if((k>= 0 && k <= allg) && gi == k*vg) {
                    //System.out.println("apelsiny " + i + " yabloki " + j + " grushi " + k);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
