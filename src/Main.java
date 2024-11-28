import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import javax.swing.*;
import java.util.jar.JarEntry;


public class Main {
    public static void main(String[] args){
      Locale.setDefault(Locale.US);
// Pierwszy program
//        String imie = "Maria";
//        int wiek = 30;
//        imie = "Ola";
//        System.out.println("Witaj "+imie+". Masz "+wiek+" lat.");


//Pobieranie wartości od użytkownika
//
//    Scanner skaner = new Scanner(System.in);
//
//    System.out.println("Podaj imie:");
//    String imie = skaner.nextLine();
//    System.out.println("imię: "+imie);
//
//    System.out.println("Podaj wiek");
//    int wiek = skaner.nextInt();
//    System.out.println("wiek: "+wiek);
//
//    System.out.println("Podaj kolor");
//    String kolor = skaner.next();
//    System.out.println("kolor: "+kolor);

//Ćwiczenie 1

//      Scanner moj_skaner = new Scanner(System.in);
//      System.out.println("Podaj imię");
//      String imie = moj_skaner.nextLine();
//      System.out.println("Podaj nazwisko");
//      String nazwisko = moj_skaner.nextLine();
//      System.out.println("Podaj hobby");
//      String hobby = moj_skaner.next();
//      System.out.println("Witaj "+imie+" "+nazwisko);
//      System.out.println("Twoje hobby to: "+hobby);


//Ćwiczenie 2
//        double a = 10;
//        double b = 3;
//        double suma;
//        suma = a+b;
//
//        System.out.println("Suma: " + suma);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);
//        System.out.println(10%2);


// Ćwiczenie 3 - kalkulator
//    Locale.setDefault(Locale.US);
//    Scanner moj_skaner = new Scanner(System.in);
//    System.out.println("Podaj pierwszą liczbę");
//    float pierwsza = moj_skaner.nextFloat();
//    System.out.println("Podaj drugą liczbę");
//    float druga = moj_skaner.nextFloat();
//
//    float suma;
//    suma = pierwsza + druga;
//    float roznica;
//    roznica = pierwsza - druga;
//    float iloczyn;
//    iloczyn = pierwsza * druga;
//    float iloraz;
//    iloraz = pierwsza / druga;
//    float reszta;
//    reszta = pierwsza % druga;
//
//    System.out.println("Suma: " + suma);
//    System.out.println("Różnica: " + roznica);
//    System.out.println("Iloczyn: " + iloczyn);
//    System.out.println("Iloraz: " + iloraz);
//    System.out.println("Reszta z dzielenia: " + reszta);

//      JFrame okno = new JFrame();
//      okno.setTitle("Pierwsza aplikacja graficzna");
//      okno.setSize(500, 800);
//
//      okno.setVisible(true);

//opeeratory przypisania
//      int a = 1;
//      System.out.println(a+=1);
//      System.out.println(a-=1);
//      System.out.println(a*=1);
//      System.out.println(a/=1);
//      System.out.println(a%=1);

//inkrementacja - dekrementacja
//        int a = 5;
//        int b;
//    //inkrementacja prefiksowa
//        b=++a;
//        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//
//    //inkrementacja postfiksowa
//        int c = 5;
//        int d;
//        d=c++;
//        System.out.println("c = "+c);
//        System.out.println("d = "+d);
//
//    //dekrementacja postfiksowa
//        int e = 5;
//        int f;
//        f=e--;
//        System.out.println("e = "+e);
//        System.out.println("f = "+f);


//zaokraglanie liczb zmiennoprzwecinowych

//        double a =10;
//        double b = 3;
//        double w = a/b;
//
//        System.out.println("to jest w:" + w);
//        double reszta = a%b;
//        double poprzecinku = reszta / b;
//        System.out.println("to jest reszta:" + reszta);
//        System.out.println("to jest tylko po przecinku:" + poprzecinku);
//
//        //1 sposob
//        System.out.println(Math.round(w));
//
//        //2 sposob - rodzaj zaokraglenia
//        BigDecimal zw = new BigDecimal(w).setScale(1, RoundingMode.DOWN);
//        System.out.println(zw);
//
//        //3 sposob
//        DecimalFormat dF = new DecimalFormat("###.#");
//        System.out.println(dF.format(w));
//
//        //4 sposob
//        String fN = String.format("%.3f", w);
//        System.out.println("to jest 4 sposób" + fN);


//  operacje finansowe
//        double a = 0.1;
//        double b = 0.1;
//
//        System.out.println(a+b);
//        System.out.println(a*b);
//
//        BigDecimal c = new BigDecimal("0.1");
//        BigDecimal d = new BigDecimal("0.1");
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(c.multiply(d));
//        System.out.println(c.add(d));

// ćwiczenie 3

//        Scanner moj_skaner = new Scanner(System.in);
//        System.out.println("Podaj wartość zamówienia");
//        float zamowienie = moj_skaner.nextFloat();
//
//        System.out.println("Podaj wartość zniżki w procentach");
//        float znizka = moj_skaner.nextFloat();
//        float calkowita;
//        calkowita = zamowienie - (zamowienie * znizka/100);
//
//        System.out.println("po znizce: " + calkowita);
//        float z_podatkiem =calkowita + calkowita * 20/100;
//        System.out.println("z podatkiem: " + z_podatkiem);
//



// zmienne tektowe string
//        String imie = "janek";
//        System.out.println(imie);
//        System.out.println(imie.length());
//
//        String dane = "Jan-Kowalski-4576890";
//        System.out.println(dane.replace("-", "."));
//
//        String dane1 = "         Jan-Kowalski    ";
//        System.out.println(dane1.strip());
//
//        String dane2 = "Jestem na kursie javy. ";
//        System.out.println(dane2.endsWith("y."));

//ćwiczenie 4
//
//        Scanner moj_skaner = new Scanner(System.in);
//        System.out.println("Podaj zdanie");
//        String zdanie = moj_skaner.nextLine();
//        nowe_zdanie = new String();
//        System.out.println(nowe_zdanie);
//

      // separatory porwnania
//
//      int a = 10;
//      int b = 10;
//      System.out.println(a==b);
//      System.out.println(a>b);
//      System.out.println(a<=b);
//      System.out.println(a!=b);
//
//      String t1 = "Java";
//      String t2 = "Java";
//
//      System.out.println(t1==t2);
//
//      String s1 = new String("Java");
//      String s2 = new String("Java");
//      System.out.println(s1);
//      System.out.println(s2);
//      System.out.println(s1==s2);
//
//      //zalecane rozwiazanie
//      System.out.println(s1.equals(s2));

      //te obiekty maja ten sam adrespamieci
      String s1 = "Java";
      String s2 = "Java";
      //a te obiekty maja rozne adresy w pamięci
      String t1 = new String("python");
      String t2 = new String("python");

      System.out.println(System.identityHashCode(t1));
      System.out.println(System.identityHashCode(t2));




    }
}
