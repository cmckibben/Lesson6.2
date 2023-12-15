package org.example;

public class Example1 {
    public static void main(String[] args) {
        int[] highScores = {10,9,8,11};
        System.out.println("i \t\t highScores[i]");
        for(int i = 0; i< highScores.length; i++)
            System.out.println("i: " + i + "\t\t" + highScores[i]);
    }
}
