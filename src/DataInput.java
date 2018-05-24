import java.util.Scanner;

public class DataInput {

    // Ввести с клавиатуры натуральное число.
    // Вывести на экран младший разряд числа.
    public static void lsDigit(){
        Scanner sc = new Scanner(System.in);// создаём объект класса Scanner
        int i;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную

            System.out.println(getLsDigit(i));

        } else {
            System.out.println("Вы ввели не целое число");
        }

    }

    public static int getLsDigit(int num){
        return num % 10;
    }

    // С клавиатуры вводится двузначное натуральное число.
    // Вывести на экран количество десятков в нем.
    public static void  numberOfTens(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int i;

        if(sc.hasNextInt()){
            i = sc.nextInt();
            System.out.println("Количество десятков в числе "+i+" = "+getNumberOfTens(i));
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }

    public static int getNumberOfTens(int num){ return num / 10; }

    // конвертер валют
    public static void curConverter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите сумму в рублях, для конвертации её в доллары и евро: ");

        int sum = sc.nextInt();

        float eurCourse = getCourseEuro();
        float usdCourse = getCourseDollar();

        // вычисляем
        float eurSum = sum / eurCourse;
        float usdSum = sum / usdCourse;

        System.out.println(sum + " рублей это: " + eurSum + " евро и " + usdSum + "$");
    }

    public static float getCourseEuro(){
        float eur = (float) 73.15;
        return eur;
    }

    public static float getCourseDollar(){
        float usd = (float) 61.98;
        return usd;
    }

    // найти среднее арифметическое
    public static void findAverage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ведите первое число: ");
        int a = sc.nextInt();

        System.out.println("Ведите второе число: ");
        int b = sc.nextInt();

        System.out.println("Ведите третье число: ");
        int c = sc.nextInt();

        // вычисляем
        System.out.println("Среднее арифметическое = " + (a+b+c)/3f);
    }

}
