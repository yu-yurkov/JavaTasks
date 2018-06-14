package testing;

public class Db {
    Questions[] questions;
    Choice[] choices;


   public Db(){
        questions = new Questions[5];

        // 1
        questions[0] = new Questions("Что такое ООП?");
        choices = new Choice[3];
        choices[0] = new Choice("Методология программирования", true);
        choices[1] = new Choice("Ответ 2", false);
        choices[2] = new Choice("Ответ 3", false);
        questions[0].setChoices(choices);

        // 2
        questions[1] = new Questions("Какие логические операции и операторы вы знаете?");
        choices = new Choice[3];
        choices[0] = new Choice("&&", true);
        choices[1] = new Choice("Ответ 2", false);
        choices[2] = new Choice("Ответ 3", false);
        questions[1].setChoices(choices);

        // 3
        questions[2] = new Questions("Сколько ключевых слов зарезервировано языком?");
        choices = new Choice[3];
        choices[0] = new Choice("50", true);
        choices[1] = new Choice("Ответ 2", false);
        choices[2] = new Choice("Ответ 3", false);
        questions[2].setChoices(choices);

        // 4
        questions[3] = new Questions("Какие примитивные типы вы знаете?");
        choices = new Choice[3];
        choices[0] = new Choice("int", true);
        choices[1] = new Choice("Ответ 2", false);
        choices[2] = new Choice("Ответ 3", false);
        questions[3].setChoices(choices);

        // 5
        questions[4] = new Questions("Что такое массив?");
        choices = new Choice[3];
        choices[0] = new Choice("Структура данных", true);
        choices[1] = new Choice("Ответ 2", false);
        choices[2] = new Choice("Ответ 3", false);
        questions[4].setChoices(choices);
    }

     public Questions[] getQuestions() {
          return questions;
     }
}
