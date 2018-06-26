package testing;

public class Choice {

    String choise;
    boolean option;

    boolean result;

    public Choice(String choise, boolean option) {
        this.choise = choise;
        this.option = option;
    }

    public Choice() {
    }

    public String getChoise() {
        return choise;
    }

    public void setChoise(String choise) {
        this.choise = choise;
    }

    public boolean isOption() {
        return option;
    }

    public void setOption(boolean option) {
        this.option = option;
    }
}
