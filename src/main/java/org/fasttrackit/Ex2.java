package org.fasttrackit;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Type : ");
        Scanner x = new Scanner(System.in);
        String string = new String();
        int count = 0;
        string = x.nextLine();

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ' )
                count++;
        }

        System.out.println("Total number of characters in a string: " + count);
        /*l-am complicat un pic sa dea numarul unui sir de caractere
        in care sa nu calculeze in variabila count spatiile dintre cuvinte
        dar imi calculeaza in variabila si numerele . Oara care e metoda sa nu puna ?
         */
    }
}
