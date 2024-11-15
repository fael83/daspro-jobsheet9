import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, arr_count;
        double average;
        System.out.print("Enter the number of array elements: ");
        int a = sc.nextInt();
        int [] arrayInt = new int [a]; 
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
            total += arrayInt[i];
        }
        average = total / arrayInt.length;
        int max_num = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] > max_num) {
                max_num = arrayInt[i];
            }
        }
        int min_num = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] < min_num) {
                min_num = arrayInt[i];
            }
        }
        System.out.println("The highest value is " + max_num);
        System.out.println("The lowest value is " + min_num);
        System.out.println("The average value is " + average);
    }
}