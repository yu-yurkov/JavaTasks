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

    // калькулятор расхода краски
    public static void calcPaint(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину комнаты в метрах:");
        float l = sc.nextFloat();

        System.out.println("Введите ширину комнаты в метрах:");
        float w = sc.nextFloat();

        System.out.println("Введите высоту комнаты в метрах:");
        float h = sc.nextFloat();

        // расход краски в литрах на м2
        float consumption = (float) .5;

        // стоимость литра краски в рублях
        int cost = 250;

        // % окна и двери
        int winDoorArea = 25;

        // вычислим площадь стен м2
        float roomArea = ((l*h)*2)+((w*h)*2);

        // площадь окон и дверей м2 от общей площади
        float winDoorAreaM2 = (roomArea/100)*winDoorArea;

        // площадь поверхности под покраску
        float paintArea = roomArea-winDoorAreaM2;

        System.out.println("Общая площадь стен = " + roomArea + " м2.");
        System.out.println("Площадь дверей и окон = " + winDoorAreaM2 + " м2.");
        System.out.println("Площадь поверхности под покраску = " + paintArea + " м2.");
        System.out.println("Потребуется " + paintArea*consumption + " литров краски.");
        System.out.println("Стоимость краски составит: " + (paintArea*consumption)*cost + " рублей.");

    }
}
