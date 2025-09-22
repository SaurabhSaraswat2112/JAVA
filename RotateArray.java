public class RotateArray {
    static void rotateArray(int arr[], int d){
        int n = arr.length;
        for(int i = 0; i < d; i++){
            int temp = arr[0];
            for(int j = 0; j < n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr,d);
        System.out.println("Array after rotation by "+d+" is : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
