package com.example.day2;

import java.util.Random;


public class Quiz2_1 {
    public static void main(String[] args) {
        int[] comNum = new int[6];

        Random rnd = new Random(System.currentTimeMillis());
        int index = 0;

        while (true) {
            int _temp = rnd.nextInt(45) + 1;
            boolean isDuplicated = false;
            for (int preVal : comNum) {
                if (preVal == _temp) {
                    isDuplicated = true;
                    break;
                }
            }
            if (isDuplicated) {
                continue;
            }

            comNum[index++] = _temp;
            if (index == 6) {
                break;
            }
        }

    }
}

