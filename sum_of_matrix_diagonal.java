import java.util.Scanner;

public class sum_of_matrix_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int rows= sc.nextInt();
        System.out.println("enter the no.of cols:");
        int cols=sc.nextInt();
        int sum =0;

        int [][]matrix = new int [rows][cols];
        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++){
                 matrix[i][j]=sc.nextInt();
                 if(i==j){
                    sum += matrix[i][j];
                 }  
            }
        }
        System.out.println("sum of the diagonals:"+sum);
    }
}
