public class checksum {
    public static void main(String[] args) {
        int []arr={3,-2,1,4,3,6,8};
        int k=10;

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]+ arr[j]==k){
                    System.out.println(arr[i]+" "+ arr[j]);
                    break;
                }

                    
            }
        }
        }
    }

