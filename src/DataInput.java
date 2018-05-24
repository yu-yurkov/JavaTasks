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

    // находим младший разряд числа
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
    public static void getAverage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ведите несколько чисел через запятую: ");
        String a = sc.next();

        String[] arr = stringExplode(a);

        // вычисляем
        System.out.println("Среднее арифметическое число = " + meanNumber(arr));
    }

    /**
     * разделение строки по пробелу
     * @param s
     * @return
     */
    public static String[] stringExplode(String s){
        String[] ex = s.split("\\p{Punct}");
        return ex;
    }

    public static int meanNumber(String[] arr){
        int num = arr.length;
        int sum = 0;

        for (int i = 0; i <num ; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        return sum/num;
    }

    /**
     * вычисление процента
     * @param p
     * @param s
     * @return
     */
    public static int getP(int p, int s){
        return (s*p)/100;
    }

}
