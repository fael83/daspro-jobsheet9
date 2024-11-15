public class LineSearch13 {
    public static void main(String[] args) {
        int [] arrayInt = {34, 10, 26, 48, 72, 20, 56, 63};
        int kkey = 20;
        int result = 0;
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == kkey) {
                result = i;
                break;
            }
        }
        System.out.println("The key in the array is located at index position " + result);
    }
}
