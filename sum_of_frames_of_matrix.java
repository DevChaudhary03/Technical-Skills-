// 3*3

public class sum_of_frames_of_matrix {
    public static void main(String[] args) {
        
    
    int[][]arr={{1,2,3,},{4,5,6},{7,8,9}};
    int sum =0;
    int n = arr.length;
    int m = arr[0].length;
    for(int i =0;i<n;i++){
        for (int j =0;j<m;j++){
            if(i==0||i==m-1||j==0||j==m-1){
                sum+=arr[i][j];
            }   
        }
    }
    System.out.println(sum);   
    
    }
}



// 4*4:
public class sum_of_frames_of_matrix {
    public static void main(String[] args) {
        
    
    int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int sum =0;
    int n = arr.length;
    int m = arr[0].length;
    for(int i =0;i<n;i++){
        for (int j =0;j<m;j++){
            if(i==0||i==m-1||j==0||j==m-1){
                sum+=arr[i][j];
            }   
        }
    }
    System.out.println(sum);   
    
    }
}