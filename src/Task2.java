import java.util.Scanner;
public class Task2 {
    public static void main(String []args) {
        System.out.println("\n" +
                "\n" +
                "ЗАДАНИЕ №2: Easy Создайте двумерный массив размеры которого задаются с клавиатуры\n" +
                "\n" +
                "Medium Easy + наполните массив случайными числами от 1 до 10\n");
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размер двумерного массива: ");
    int size1 = sc.nextInt();
    int size2 = sc.nextInt();
    int t;
    int [][]arr = new int[size1][size2];
    for (int i = 0; i < arr.length; i++) {
        for (int j =0 ; j < arr[i].length; j++) {
            t = (int )Math.round(Math.random() * 10 );
            arr[i][j]=t;
            System.out.print(arr[i][j] + "  ");
        }
        System.out.println();
    }
}
    }


