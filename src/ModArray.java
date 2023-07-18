import java.util.Scanner;

public class ModArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter B : ");
        int B = scanner.nextInt();
        int output = findModArray(array, B);
        System.out.println("Output : " + output);
    }

    private static int findModArray(int[] array, int b) {
        int N = array.length;
        int result = 0, power = 1;
        for (int i = N - 1; i >= 0; i--){
//            System.out.println("Result : "+ result);
            result = (result + ((array[i] % b) * power)) % b;

//            System.out.println("Power : "+ power);
            power = (power * 10) % b;
        }
        return result;
    }
}
