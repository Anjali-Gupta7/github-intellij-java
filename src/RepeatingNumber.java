import java.util.Scanner;

public class RepeatingNumber {
    static int findRepeatingNumber(int[] arr){
        for (int i=0; i< arr.length; i++){ //first number
            for (int j=i+1; j< arr.length; j++){ //second number
                if (arr[i] == arr[j]){ //found answer
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter "+n+" elements");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeating number: "+findRepeatingNumber(arr));
    }
}
