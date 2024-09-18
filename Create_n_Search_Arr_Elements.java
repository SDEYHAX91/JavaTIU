//Take an array as input from the user. Search a given number x and print the value and index at which it occur.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements for the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter for element " + (i+1) + " = ");
            arr[i] = scan.nextInt();
        }
    System.out.print("Enter value for search: ");
    int x = scan.nextInt();
    int flag = 0;
    for(int j = 0; j < n; j++){
        if (arr[j] == x){
            flag = 1;
            System.out.println("Given element found in the array.");
            System.out.println("Element : " + arr[j]);
            System.out.println("Index : " + j);
            break;
        }else{
            flag = 0;
        }
    }
    if(flag == 0){
        System.out.println("Given element not found in the array.");
    }
    }
}
