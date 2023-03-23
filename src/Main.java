public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
    }
    public static void task1(){
        System.out.println("Задача 1.");

        int summ = 0;
        int finalSumm = 2_459_000;
        short deposision = 15_000;
        short month = 1;

        while (summ < finalSumm){
            summ = summ + deposision;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + summ + " рублей");
            month++;
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задача 2.");

        byte i = 0;

        while(i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (;i > 0;i--){
            System.out.print(i + " ");
        }
    }
    public static void task3(){
        System.out.println("Задача 3.");

        int peopleCountry = 12000000;//население страны
        int birth = (peopleCountry/1000) * 17;//рождаемость
        int death = (peopleCountry/1000) * 8;//смертность

        for(int i = 1;i <= 10;i++){
            peopleCountry+=(birth - death);//население с учотом рождаемости и смертности
            System.out.println("Год " + i + ", численность населения составляет " + peopleCountry );
        }
    }
    public static void task4(){
        System.out.println("Задача 4.");

    }

}