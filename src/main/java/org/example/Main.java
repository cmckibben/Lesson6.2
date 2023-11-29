package org.example;

public class Main {
  public static void main(String[] args) {
      String[] d = new String[4];
      d[0] = "One";
      d[1] = "Two";
      d[2] = "Three";
      d[3] = "Four";

      for (int i = 0; i < d.length; i++)
         System.out.println(d[i].toUpperCase());

      for (int i = d.length -1 ; i >= 0; i--)
          System.out.println(d[i]);
  }
}