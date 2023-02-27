public class Cycles {

    private int number;
    private int numberFrom;
    private int numberTo;
    private int monthDeferMoney;
    private int sum;
    private int percent;
    private float temp;

    public  void task1(){
        System.out.println("Задача 1");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println(" ");
    }

    public  void task2(){
        System.out.println("Задача 2");
        for(int i = 10; i != 0; i--){
            System.out.println(i);
        }
        System.out.println(" ");
    }

    public  void task3(){
        System.out.println("Задача 3");
        numberFrom = 0;
        numberTo = 17;
        System.out.println("Четные числа:");
        for(int i = numberFrom; i <= numberTo; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println(" ");
    }

    public void task4(){
        System.out.println("Задача 4");
        numberFrom = 10;
        numberTo = -10;
        for(int i = numberFrom; i >= numberTo; i--){
            System.out.println(i);
        }
        System.out.println(" ");
    }

    public void task5(){
        System.out.println("Задача 5");
        numberFrom = 1904;
        numberTo = 2096;
        for(int i = numberFrom; i <= numberTo; i++){
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println(" ");
    }

    public void task6() {
        System.out.println("Задача 6");
        numberFrom = 1;
        numberTo = 98;
        for (int i = numberFrom; number < numberTo; i++) {
            number = i * 7;
            System.out.println(number);
        }
        System.out.println(" ");
    }

    public void task7() {
        System.out.println("Задача 7");
        numberFrom = 1;
        numberTo = 512;
        for (int i = numberFrom; i <= numberTo; i *= 2) {
            System.out.println(i);
        }
        System.out.println(" ");
    }

    public void task8(){
        System.out.println("Задача 8");
        number = 12; // количество месяцев
        sum = 0;
        monthDeferMoney = 29_000;
        for (int i = 1; i<=number; i++){
            sum += monthDeferMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println(" ");
    }

    public void task9(){
        System.out.println("Задача 9");
        number = 12; // количество месяцев
        sum = 0;
        percent = 12;
        monthDeferMoney = 29_000;
        temp = (percent / 12f + 100f) / 100f; // расчитываем коэффицент для данного процента
        for (int i = 1; i<=number; i++){
            sum = (int) ((sum + monthDeferMoney) * temp);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println(" ");
    }

    public void task10(){
        System.out.println("Задача 10");
        for(int i = 1; i<=10; i++){
            System.out.println("2*" + i + "=" + i*2);
        }
        System.out.println(" ");
    }
}
