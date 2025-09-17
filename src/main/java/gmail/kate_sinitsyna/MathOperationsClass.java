package gmail.kate_sinitsyna;

public class MathOperationsClass {

    public static void main(String[] args) {
        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int countDay = 21;
        int countHoliday = 8;
        int countPeople = 1;
        int countTask = 59;
        int countTaskPerDay = 2;
        int countTaskPerHoliday = 4;

        int needCountPeople = countTask / countTaskPerDay;
        System.out.println("Necessary count of people for 1 day:" + " " + needCountPeople);

        int expectedCountCompletedTask = countPeople * countTaskPerDay * countDay;
        System.out.println("Expected count of completed task:" + " " + expectedCountCompletedTask);

        int countSum = countDay * countTaskPerDay + countHoliday * countTaskPerHoliday;
        System.out.println("Expected count of completed task for whole month:" + " " + countSum);

        int diffCountTask = countTask - expectedCountCompletedTask;
        System.out.println("Diff between expected count of task and real completed task:" + " " + diffCountTask);


//применить несколько арифметических операций над int и double в одном выражении
//применить несколько логических операций ( < , >, >=, <= )
   int countCars = 2;
   int countTrucks = 3;
   double fuelConsumtiontPer100KmCar = 5.1;
   double fuelConsumtiontPer100KmTruck = 9.9;
   int distance = 200;
   double fuelTank = 10000;

   double sumConsumtions = distance * (countCars * fuelConsumtiontPer100KmCar + countTrucks * fuelConsumtiontPer100KmTruck);
   double fuelLeft = fuelTank - sumConsumtions;
   System.out.println("total fuel consumption:" + " " + sumConsumtions);
   System.out.println("Remaining fuel in the tank:" + " " + fuelLeft);

        if (sumConsumtions < fuelTank * 0.2) {
            System.out.println("Get discont");
        } else {
            System.out.println("Without discont");
        }

// Получить переполнение
   byte a = 127;
   byte b = 50;
   //byte c = a + b;
 // System.out.println("overflow:" + " " + c);
    }
}
