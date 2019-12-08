package com.homework;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of triangles (Please input odd number): ");
        float l = scanner.nextFloat();
        if (l % 2 == 0){
            System.out.print("Please be careful. Input odd number. If your next input won't be odd, I'll take the next odd number: ");
            l = scanner.nextFloat();
            if (l % 2 == 0){
                l += 1;
            }
        }

        Triangles triangle = new Triangles(l);
        //a
        triangle.a_empty();
        System.out.println();
        triangle.a_full();
        System.out.println();
        //b
        triangle.b_empty();
        System.out.println();
        triangle.b_full();
        System.out.println();
        //c
        triangle.c_empty();
        System.out.println();
        triangle.c_full();
        //d
        triangle.d_full();
        System.out.println();
        triangle.d_empty();
        System.out.println();
        //e
        triangle.e_empty();
        System.out.println();
        triangle.e_full();
        System.out.println();
        //f
        triangle.f_empty();
        System.out.println();
        triangle.f_full();
        System.out.println();

        //g
        triangle.g_empty();
        System.out.println();
        triangle.g_full();
        System.out.println();
        //h
        triangle.h_empty();
        System.out.println();
        triangle.h_full();
        System.out.println();


    }
}

