public class MaxProduct{
    static void sortArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 7, 0};
        sortArray(arr);
        int n = arr.length;
        int maxProduct = arr[n-1] * arr[n-2] * arr[n-3];
        System.out.println("Maximum product of three numbers in the array is: " + maxProduct);
    }
}
