package gmail.kate_sinitsyna;

import java.util.List;

public class Human {
    private final String name;
    private final int age;
    private final boolean isCute;


    public Human(String name, int age, boolean isCute) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
    }

    void printSomeValues(int i, String str, List<String> list){
        i = 100;
        list.add("Selenide");
        System.out.println("int: " + i + " " + "str: " + str.toUpperCase() + " " + list);
    };

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
