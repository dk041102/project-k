import java.util.*;
public class 2dmatrix{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloums :");
        int coloums = sc.nextInt();
        int arr[][] = new int[rows][coloums];
        System.out.println("Enter the elements :");
        for(int i =0;i<rows;i++){
            for(int j =0;j<coloums;j++){
                System.out.println("element at [" + (i+1) + "][" + (j+1) + "] :");
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Array elements");
        for(int i =0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                System.out.println(arr[i][j] +" ");
            }
        }
    }
}