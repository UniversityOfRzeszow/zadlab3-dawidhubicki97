/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;


public class Main {

    public void zadaniepierwsze() {
        Scanner s = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int wynik, wybor;
        wynik = s.nextInt();

        System.out.println("1.>>");
        System.out.println("2.<<");
        System.out.println("3.>>>");
        wybor = s.nextInt();
        switch (wybor) {
            case 1: {
                System.out.println("O ile bitow chcesz przesunac");
                int liczba;
                liczba = s.nextInt();
                wynik >>= liczba;
                System.out.println("Wynik to: " + wynik);
                break;
            }
            case 2: {
                System.out.println("O ile bitow chcesz przesunac");
                int liczba;
                liczba = s.nextInt();
                wynik <<= liczba;
                System.out.println("Wynik to: " + wynik);
                break;
            }
            case 3: {
                System.out.println("O ile bitow chcesz przesunac");
                int liczba;
                liczba = s.nextInt();
                wynik >>>= liczba;
                System.out.println("Wynik to: " + wynik);
                break;
            }
        }

    }

    public void zadaniedrugie() {
        System.out.println("Prezentacja dzialania XOR");
        boolean x = false;
        boolean y = false;
        boolean wynik = x ^ y;
        System.out.println("Falsz i falsz: " + wynik);

        x = true;
        y = false;
        wynik = x ^ y;
        System.out.println("Prawda i falsz: " + wynik);

        x = false;
        y = true;
        wynik = x ^ y;
        System.out.println("Falsz i Prawda: " + wynik);

        x = true;
        y = true;
        wynik = x ^ y;
        System.out.println("Prawda i prawda: " + wynik);

        System.out.println("Prezentacja dzialania negacji");
        System.out.println("Normalna wartosc logiczna dla zmiennej x: " + x);
        System.out.println("Wartosc z not dla zmiennej x: " + !x);
    }

    public void zadanietrzecie() {
        System.out.println("Metoda toCharArray zmienia typ danych ze String na lancuch Char: ");
        String wyraz = "Uniwersytet Rzeszowski";
        char[] lancuch = new char[wyraz.length()];
        lancuch = wyraz.toCharArray();
        System.out.println(lancuch);

        System.out.println("Metoda getBytes zwraca wartosc bitowa Stringa");
        System.out.println(wyraz.getBytes());

        System.out.println("Metoda equals porownuje ze soba dwa Stringi. W tym przypadku sa takie same: ");
        if (wyraz.equals("Uniwersytet Rzeszowski")) {
            System.out.println("Wyrazy sa takie same");
        } else {
            System.out.println("Wyrazy nie sa takie same");
        }
        System.out.println("Metoda equalsIgnoreCase porownuje ze soba dwa Stringi i nie zwraca uwagi na wielkoscliter. W tym przypadku zwraca wartosc true: ");
        if (wyraz.equalsIgnoreCase("Uniwersytet RzeSZowski")) {
            System.out.println("Wyrazy sa takie same");
        } else {
            System.out.println("Wyrazy nie sa takie same");
        }
        System.out.println("Metoda compareTo porownuje dwa Stringi leksykograficznie");
        System.out.println(wyraz.compareTo("Uniwersytet Rzeszowski"));
        System.out.println("Metoda compareToIgnoreCase porownuje dwa Stringi leksykograficznie i ignoruje wielkość liter");
        System.out.println(wyraz.compareToIgnoreCase("Uniwersytet Rzeszowski"));
        System.out.println("Metoda indexOf zwraca index pierwszego wystepującego podanego znaku w Stringu. W tym przypadku zwraca index pierwszego w");
        System.out.println(wyraz.indexOf("w"));
        System.out.println("Metoda lastIndexOf zwraca index ostatniego wystepującego podanego znaku w Stringu. W tym przypadku zwraca index ostatniego w");
        System.out.println(wyraz.lastIndexOf("w"));
        System.out.println("Metoda substring zwraca podaną przez nas część Stringa. W tym przypadku znaki o indeksie od 0 do 2");
        System.out.println(wyraz.substring(0, 2));
        System.out.println("Metoda replace zastepuje określone przez nas znaki podanymi przez nas znakami. W tym przypadku zamienia każde w na z");
        System.out.println(wyraz.replace('w', 'z'));
        System.out.println("Metoda trim usuwa puste indexy na początku oraz końcu Stringa.");
        System.out.println(wyraz.trim());
        System.out.println("Metoda toLowerCase zamienia wszystkie litery na male litery.");
        System.out.println(wyraz.toLowerCase());
        System.out.println("Metoda toUpperCase zamienia wszystkie litery na wielkie litery.");
        System.out.println(wyraz.toUpperCase());
        System.out.println("Metoda split rozdziela Stringa na mniejsze od podanego przez nas znaku. W tym przypadku jest to znak s");
        for (String retval : wyraz.split("s")) {
            System.out.println(retval);
        }

    }

    public static int potegowanieIteracyjne(int liczba, int wykladnik) {
        int wynik = 1;
        while (wykladnik > 0) {
            wynik *= liczba;
            wykladnik--;
        }
        return wynik;
    }

    public static int potegowanieRekurencyjne(int liczba, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        }
        return liczba * potegowanieRekurencyjne(liczba, --wykladnik);
    }

    public static int ciagFibonacciego(int liczba) {
        if ((liczba == 1) || (liczba == 2)) {
            return 1;
        } else {
            return ciagFibonacciego(liczba - 1) + ciagFibonacciego(liczba - 2);
        }
    }

    public static void main(String[] args) {

        Main obiekt = new Main();
        Scanner s = new Scanner(System.in);
        
        System.out.println("1.Zadanie 1.4");
        System.out.println("2.Zadanie 1.7");
        System.out.println("3.Zadanie 2.2");
        System.out.println("4.Zadanie 3.3");
        System.out.println("5.Zadanie 3.4");
        int wybor = s.nextInt();
        switch (wybor) {
            case 1:
                obiekt.zadaniepierwsze();
                break;
            case 2:
                obiekt.zadaniedrugie();
                break;
            case 3:
                obiekt.zadanietrzecie();
                break;
            case 4: {
                int liczba, wykladnik;
                System.out.println("Podaj liczbe: ");
                liczba = s.nextInt();
                System.out.println("Podaj wykladnik: ");
                wykladnik = s.nextInt();
                System.out.println("Iteracyjnie: " + potegowanieIteracyjne(liczba, wykladnik));
                System.out.println("Rekurencyjnie: " + potegowanieRekurencyjne(liczba, wykladnik));
                break;
            }
            case 5: {
                int liczba;
                System.out.println("Podaj wyraz ciagu fibonacciego: ");
                liczba = s.nextInt();
                System.out.println("Ten wyraz5 to: " + ciagFibonacciego(liczba));
            }

        }


    }
}
