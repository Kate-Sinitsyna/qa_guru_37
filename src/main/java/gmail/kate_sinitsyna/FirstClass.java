package gmail.kate_sinitsyna;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstClass {

    public static void main(String[] args) {


        // 1,2,3,4 Целочисленные типы
        byte aByte = 0; //-128 +127
        short aShort = 0; //-32768 +32767
        int aInt = 0; // (-2^32) .. (+2^32-1)
        Integer intWrapper = 5; // обертка
        long aLong = 0; // (-2^64) .. (+2^64-1)
        // 5,6 Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;
        // 7 Символьный
        char aChar = 'f'; // хранит числовой код символа, который является целым числом
        Character charWrapper = 'g';  // обертка
        // 8 Логический тип
        boolean aBoolean = true;
        Boolean booleanWrapper = true;  // обертка
        // Строка (и бесконечность других объектных/ссылочных типов данных)
        String toBePrint = "Hello and welcome!";
        List<String> teachers = List.of("Stanislav","Dmirtiy");
        //Операторы
        // Оператор присвоения =
        String name = "1";
        // Арифметические операторы + - / * % ++ --
        int result = ++aInt;
        System.out.println(result);
        // Операторы сравнения >, <, >=, <=, !=, ==
        //System.out.println(3 == 2);
        //Логические операторы &, | , && , || , ! , ^
        String name1 = "Kate";
        int age = 33;
        System.out.println(name1.equals("Kate") && age == 31);
        System.out.println(!(name.equals("Kate")));
        // Оператор instanceof
        System.out.println(name instanceof String); //является ли переменная типом String
        System.out.println(!(name instanceof String)); //не является ли переменная типом String

        // Тернарный оператор - что-то проверить прежде чем сделать
        char sex = 'm';

        //String childname = sex == 'm' ? "Valentin" : "Valentina" //является ли пол мужским, есди Да - Валентин, иначе - имя Валентина

        //Управляющая конструкция if

      //  if (sex == 'm') {
       //     childname = "Valentin";
       // } else {
       //     childname = "Valentina";
       // }

        //ключевое слово new - предназначено для создания объектов
        //String name = new String("Kate");


    }
}