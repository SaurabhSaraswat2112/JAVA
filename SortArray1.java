public class SortArray1
{
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
        int arr[] = {5, 2, 9, 1, 5, 6};
        sortArray(arr);
        System.out.println("Sorted array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
