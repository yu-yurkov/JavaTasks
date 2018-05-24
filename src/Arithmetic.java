import java.util.Scanner;

public class Arithmetic {

    // поменять местами среднюю цифру в трехзначных числах
    public static void changeDigit(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A:");
        int a = sc.nextInt();

        System.out.println("Введите число B:");
        int b = sc.nextInt();

        System.out.println("Меняем местами средние цифры чисел:");
        System.out.println("Число A = " + (a/100)%10 + (b/10)%10 + a%10);
        System.out.println("Число B = " + (b/100)%10 + (a/10)%10 + b%10);

//        System.out.println(a%10);
//        System.out.println((a/10)%10);
//        System.out.println((a/100)%10);

    }

    // сумма и разность чисел
    public static void sumNumbers(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите четырёхзначное число:");
        int a = sc.nextInt();

        int sum = (a/1000)%10 + (a/10)%10;
        System.out.println("Сумма первой и третьей цифры = " + sum);

        int diff = (a/100)%10 - a%10;
        System.out.println("Разность второй и четвертой цифры = " + diff);
    }

    // удалить среднее число
    public static void delAverageDigit(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите трёхзначное число:");
        int a = sc.nextInt();
        System.out.println("Убрали среднюю цифру, получили = " + (a/100)%10 + a%10);

    }

    // процент по вкладам
    public static void interestOnDeposit() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        int depo = sc.nextInt();

        System.out.println("Введите желаемый процент годового дохода:");
        int persent = sc.nextInt();

        // вычислим годовой доход
        float profit = (depo*persent)/100;

        // ежемесячный доход
        float monthProfit = profit /12;

        System.out.println("Суммарный годовой доход от вклада составит: " + profit + " рублей");
        System.out.println("Ежемесячный доход составит: " + monthProfit + " рублей");
    }
}
