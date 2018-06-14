package testing;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        System.out.println("Система тестирования!");

        Db db = new Db();
        Questions[] questions = db.getQuestions();

        for (int i = 0; i < questions.length; i++) {
            
            System.out.println("Вопрос №"+i+":"+questions[i].getText());

            System.out.println("Варианты ответа:");


            Choice[] choices = questions[i].getChoices();

            for (int j = 0; j <  choices.length; j++) {
                System.out.println(choices[j].getChoise());
            }

            System.out.println("Введите вариант ответа:");


        }


    }


}
