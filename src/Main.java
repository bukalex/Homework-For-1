import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 2:");
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 3:");
        for(int i = 0; i <= 17; i+=2){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 4:");
        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 5:");
        for(int i = 1904; i <= 2096; i+=4){
            System.out.println(i + " год - високосный год.");
        }

        System.out.println(" ");

        System.out.println("Задание 6:");
        for(int i = 7; i <= 98; i+=7){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("Задание 7:");
        for(int i = 0; i <= 9; i+=1){
            System.out.println((int) pow(2, i));
        }

        System.out.println(" ");

        System.out.println("Задание 8:");
        int total = 0;
        int eachMonth = 29000;
        for(int i = 1; i <= 12; i++){
            total += eachMonth;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total + "рублей.");
        }

        System.out.println(" ");

        System.out.println("Задание 9:");
        total = 0;
        for(int i = 1; i <= 12; i++){
            total += total/100;
            total += eachMonth;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total + "рублей.");
        }
    }
}