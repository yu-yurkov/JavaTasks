package testing;

import java.awt.*;

public class Questions {

    // текст вопроса
    String text;

    // варианты ответов
    Choice[] choices;

    // результат
    int result;

    // пустой конструктор
    public Questions(){

    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Questions(String text){
        this.text= text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }
}
