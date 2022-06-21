package org.example;

import javafx.util.Pair;

import java.util.Scanner;
import java.util.Vector;

public class Person
{
    public int[] addBookedSlots(int n)
    {
        Scanner sc = new Scanner(System.in);

        Vector<Pair<Integer, Integer>> test = new Vector<>();

        int[] time = new int[10000];

        for (int i = 0; i < n; i++) {
            int start, end;
            System.out.println("Enter slots");
            System.out.println("start :");
            start = sc.nextInt();
            System.out.println("end");
            end = sc.nextInt();

            Pair<Integer, Integer> p = new Pair<>(start, end);

            test.add(p);

            for (int j = start; j < end; j++) {
                time[j] = 1;
            }
        }
        return  time;
    }
}
