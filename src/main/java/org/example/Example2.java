package org.example;

public class Example2 {
    private static int[] a = {-20, -15, 2, 8, 16, 33};
    public static void doubleLast() {
        for(int i = a.length /2; i < a.length; i ++)
            a[i] = a[i] * 2;
    }

    public static void main(String[] args) {
        doubleLast();
        System.out.println("i  \t\ta[i]");
        for(int i =0; i <a.length; i++)
            System.out.println("i: " + i + "\t" +a[i]);
    }
}
