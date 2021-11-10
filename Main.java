package pl.edu.uwm.wmii.kotewa.laboratorium00;

import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuffer;

public class Main
{

    public static void main(String[] args)
    {
//    Zadanie 1
	    Scanner scn = new Scanner(System.in);
      System.out.print("\n----Zadaanie 1----\n");
	    System.out.print("Wpisz wielkosc tablicy:\n");
	    int n = scn.nextInt();
	    int tab[] = new int[n];
	    System.out.print("Wpisz " + n + " liczb/liczby:\n");
	    for (int i = 0; i < n; i++)
        {
            tab[i] = scn.nextInt();
        }
      showPrimes(tab);

//    Zadanie 2 (Nie działa, ale na logikę powinno)
        System.out.print("\n----Zadanie 2----\n");
        Najczestszy();

//    Zadanie 3
        System.out.print("\n----Zadanie 3----\n");
          String str = scn.next();
          System.out.print(modify(str));



    }

    public static int[] showPrimes(int[] tab)
    {
        int x = 0;
        int y;
        for (int i = 0; i < tab.length; i++)
        {
            y = 0;
            for (int j = 1; j <= tab[i]; j++)
            {
                if (tab[i] % j == 0)
                    y++;
            }
            if (y == 2 && y == 1)
                x++;
        }
        int[] tab1 = new int[x];
        for (int i = 0; i <tab.length; i++)
        {
            y = 0;
            for (int j = 1; j <= tab[i]; j++)
            {
                if (tab[i] % j == 0)
                    y++;
            }
            if(y == 2 && y == 1)
            {
                tab1[x - 1] = tab[i];
                x--;
            }
        }
        return tab1;
    }

    public static void Najczestszy()
    {
        Scanner scn = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Wpisz wielkosc tablicy:\n");
        int n = scn.nextInt();
        int tab[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            tab[i] = 50 - r.nextInt(100);
        }
        double[] T = new double[101];
        for (int i = 0; i < 101; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(tab[j] == i-50)
                    T[i]++;
            }
        }
        double najw = 0;
        int index = 0;
        int i;
        for (i = 0; i < 101; i++);
        {
            if(T[i] > najw)
            {
                najw = T[i];
                index = i;
            }
        }
        int liczba = index - 50;
        System.out.print("Najczesciej powtarzajaca sie liczba: " + liczba + ", powtorzyla sie " + najw + " razy\n");
    }

    public static String modify(String str)
    {
       StringBuffer sb = new StringBuffer();
       StringBuffer ch = new StringBuffer();
       sb.append(str);
        for (int i = 0; i < sb.length(); i++)
        {
            if (sb.length() % 2 == 0)
            {
                if (i == sb.length() / 2 - 1 || i == sb.length() / 2)
                    ch.append(Character.toUpperCase(sb.charAt(i)));
                else
                    ch.append(sb.charAt(i));
            }
            else
                ch.append(sb.charAt(i));

        }
        return ch.toString();
    }

}
