// wap to sum of upper diganoal element of an matrix

import java.util.Scanner;

public class upper_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th no. of rows:");
        int rows  = sc.nextInt();
        System.out.println("enter th no. of cols:");
        int cols  = sc.nextInt();
        int [][]arr = new int[rows][cols];
        System.out.println("matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(i<j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        
    }
}
// 
// wap to sum of lower diganol of a matrix