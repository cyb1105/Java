package com.example.day2;

public class Demo2 {
    public static void main(String[] args) {
//        int[] scores = {1, 2, 3, 4, 5, 6, 7};

//        System.out.println(scores.length);
//        System.out.println(scores[0]);
//        System.out.println(scores[6]);
//
//        String[] names = {"A", "BB", "CCC", "DDDD", "EEEEE"};
//        System.out.println(names.length);
//        System.out.println(names[1]);
//        names[4] = "JAVA";
//        System.out.println(names[4]);

         String[] names = new String[]{"A", "BB", "CCC", "DDDD", "EEEEE"};
         int[] scores;
//         scores = {1,2,3,4,5,6,7};
        scores = new int[]{1,2,3,4,5,6,7};

        String[] animals = new String[5];
        System.out.println(animals.length);
        System.out.println(animals[0]);
        System.out.println(animals[4]);
        animals[4] ="cat";
        animals[3] = new String("dog");
        animals[2] = new String("tiger");
        animals[1] = new String("lion");
        animals[0] = new String("rat");


        for(int i=0 ; i < animals.length; i++){
            System.out.println(i+":"+animals[i]);
        }

        int index = 0;
        for (String a : animals){
            System.out.println(index++ +":"+a);
        }

        double[] d = new double[5];
        d[0] = 0.0;
        d[1] =3.14f;
        d[2] = 100;
        d[3] = 3_200_000_000L;
        d[4] = 'A';

        for(double _d:d){
            System.out.println(_d);
        }

    }
}
