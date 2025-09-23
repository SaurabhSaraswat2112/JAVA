public class MoveZeros {
    static void moveZeros(int[] arr){
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args){
        int arr[] = {2, 0, 7, 1, 0, 0, 6};
        moveZeros(arr);

        System.out.println("Updated Array : ");

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
}
