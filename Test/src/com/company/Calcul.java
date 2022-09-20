package com.company;

public class Calcul {
    public static int sum(int a, int b){
        return a + b;
    }
    public static int razn(int a, int b){
        return a - b;
    }
    public static int proiz(int a, int b){
        return a * b;
    }
    public static int chastn(int a, int b){
        return a / b;
    }
    public static int step(int a, int b){
        return (int) Math.pow(a, b);
    }
    public static int plParallelepiped(int a, int b, int c){//2, 3, 4
        return 2 * ((a*b) +(b * c) + (a * c));
    }
}
