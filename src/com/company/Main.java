package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Treugolnik treugolnik = new Treugolnik();
        System.out.println("Пример: \na: 7\nb: 7\nc: 7\n");
        System.out.println("Введите размеры треугольника:");
        treugolnik.area(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}