public class sum_of_non_frames_ {
    public static void main(String[] args) {
        
    
    int[][]arr={{1,2,3,},{4,5,6},{7,8,9}};
    int sum =0;
    int n = arr.length;
    int m = arr[0].length;
    for(int i =0;i<n;i++){
        for (int j =0;j<m;j++){
            if(i!=0 && i!=m-1 && j!=0 && j!=m-1){
                sum+=arr[i][j];
            }   
        }
    }
    System.out.println(sum);   
    
    }
}

// or 
 public static void main(String[] args) {
        
    
    int[][]arr={{1,2,3,},{4,5,6},{7,8,9}};
    int sum =0;
    int n = arr.length;
    int m = arr[0].length;
    for(int i =1;i<n-1;i++){
        for (int j =1;j<m-1;j++){
                sum+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println();  
        }
        
    }
}
       
    
    