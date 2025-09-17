package gmail.kate_sinitsyna;

import java.util.*;

public class Main {

    public static void main(String[] arg) {
       // Human katya = new Human();
       // System.out.println("Name is " + katya.name);
       // System.out.println("Age is " + katya.age);
       // System.out.println("Is she cute?  " + katya.isCute);

        //katya.name = "Ekaterina";
       // katya.age = 33;
       // katya.isCute = true;

       // System.out.println("Name is " + katya.name);
      //  System.out.println("Age is " + katya.age);
      //  System.out.println("Is she cute?  " + katya.isCute);

        //katya.setName("Ekaterina");
        Human dima = new Human(
                "Kate", 34, true);
        List<String> lecture = new ArrayList<>(); //создается новый мутабедбный объект
        lecture.add("git");
        lecture.add("java");
        lecture.add("files");
        lecture.add("jUnit");
        //List<String> lecture = List.of("git","java", "files", "jUnit"); создается немутабельный объект типа строка
        int hours = 12;
        String hello = "Hello";

        dima.printSomeValues(hours, hello, lecture);
        System.out.println("After method: "+ hours);
        System.out.println("After method: "+ hello);
        System.out.println("After method: "+ lecture);

        String[] lectureArray = new String[4];
        lectureArray[0] = "git";
        lectureArray[1] = "java";
        lectureArray[2] = "files";
        lectureArray[3] = "jUnit";

       // String[] lectureArray = new String[]{"git","java","files","jUnit"};
        //lectureArray.length - единственная спец.команда для массива
       // int[] intArray0 = new int[]{1,2,3};
       // int[] intArray1 = new int[]{11,22,33};
      //  int[][] biArray = new int[]{intArray0, intArray1};
      //  System.out.println("After method: "+ biArray);

        //for (int i = 0; i < lectureArray.length; i++){
        //    System.out.println(lectureArray[i]);
       // };
       // for (int i = lectureArray.length - 1; i >= 0; i--){ //цикл со счетчиком
        //    System.out.println(lectureArray[i]);
       // };

      //  for (String lectureName : lectureArray){System.out.println(lectureName);} //цикл, который предназначен для прямого перебора (без использования индекса)

      //  int i = 0;
      //  while (i < lectureArray.length){
      //      System.out.println(lectureArray[i]);
      //      i++;
     //   }

      //  do {
      //      System.out.println(lectureArray[i]);                    //используется когда необходимо, чтобы выполнилась хотя бы одна итерация безусловно обязательно
      //  } while (i < lectureArray.length);

        //выход из цикла
        for (String lectureName : lectureArray){
            if (lectureName.startsWith("j")){
                System.out.println(lectureName);
                break;                     // полный выход из цикла
            }
        }

        for (String lectureName : lectureArray){
            if (!lectureName.startsWith("j")){
               continue;                   // если название лекции не начинается с j, то прерви итерацию и переходи к новой итерации
            }
            System.out.println(lectureName);
        }

       Set<String> lecturesSet = new HashSet<>();
}
}