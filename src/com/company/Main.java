package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero");
        String valor = scanner.nextLine();
        int n = Integer.parseInt(valor);
        Numero miNumero = new Numero(n);
        System.out.println(miNumero.esPar());
        if (miNumero.esPar()) {
            System.out.println("es par");
        } else System.out.println("es impar");
    }
}
