import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        taskText();
        sumFunction();

    }
    public static void taskText(){
        String name;

        System.out.println("ЗАДАЧА №1: Medium Установите Java 1.8 + IDEa Создайте несколько одноименных методов (2-3 шт)\n " +
                "с разными входными параметрами, реализуйте в каждом из них ввод с клавиатуры\n" +
                " и передачу в данный метод переменных с последующим выводом результата любого арифметического действия\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваше имя: ");
        name = sc.nextLine();
        System.out.println("Здраствуйте " + name + " Удачи в усвоений!!!" );

    }
    public static void sumFunction(){
        int a;
        int b;
        int c;
        Scanner sum = new Scanner(System.in);
        System.out.println("Введите первую переменную а: ");
        a = sum.nextInt();
        System.out.println("Введите вторую переменную b: ");
        b = sum.nextInt();
        c = a + b;
        System.out.println("Сумма значений равна: " + c);
    }

}
