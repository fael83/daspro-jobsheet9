import java.util.Scanner;
public class ArrayAverageScore13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int totalPassed = 0, totalFailed = 0;
            double total1 = 0,total2=0, average1, average2;
            System.out.print("Enter the number of student: ");
            int b = sc.nextInt();
            int [] score = new int [b];
            for (int i = 0; i < score.length; i++){
                System.out.print("Enter the final score " + i + ": ");
                score[i] = sc.nextInt();
                if (score[i] > 70) {
                    totalPassed += score[i];
                    total1 += 1;
                }else{
                    totalFailed += score[i];
                    total2 += 1;
                }
            }
            average1 = totalPassed / total1;
            average2 = totalFailed / total2;
            System.out.println("The average score of student who passed is " + average1);
            System.out.println("The average score of student who failed is " + average2);
    }    
}
