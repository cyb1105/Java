package com.example.day2;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        int[] intval = new int[6];
        int[] lottonum = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.print("로또번호 입력: ");

        for(int i = 0 ; i < lottonum.length ; i++) {
            lottonum[i] = sc.nextInt();
        }
        Random r = new Random(System.currentTimeMillis());
        for(int i = 0;i<6;i++){
            intval[i] = r.nextInt(45)+1;
//            System.out.println(intval[i]);
        }

        int cnt = 0;
        for(int i=0; i<lottonum.length ; i++){
            for(int j=0; j<lottonum.length; j++){
                if(lottonum[i]==intval[j])
                    cnt = cnt + 1;
            }
        }

        System.out.println(cnt);

    }
}
