import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows:");
        int rows =  sc.nextInt();
        System.out.println("emter the no.of cols:");
        int cols = sc.nextInt();
        int[][]matrix=new int [rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is :");
        for (int i=0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.print(matrix[i][j]);
            }
        }


    }
}
