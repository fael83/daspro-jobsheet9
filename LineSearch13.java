import java.util.Scanner;
public class LineSearch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        int result = 0;
        System.out.print("Enter the number of array elements: ");
        int a = sc.nextInt();
        int [] arrayInt = new int [a]; 
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
        key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key) {
                System.out.println("The key in the array is located at index position " + i);
                break;
            }else if (i == arrayInt.length - 1) {
                System.out.println("Key not found");
            }
        }
    }
}
