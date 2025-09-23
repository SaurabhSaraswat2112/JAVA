public class MergeArray {
    static void mergeArray(int arr1[], int arr2[], int[] mergeArray){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1+n2;    // size of merge array

        int k = 0;

        for(int i : arr1){
            mergeArray[k++] = i;
        }
        for(int i : arr2){
            mergeArray[k++] = i;
        }
    }
    public static void main(String[] args){
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};

        int n3 = arr1.length + arr2.length;
        int mergeArray[] = new int[n3];
        mergeArray(arr1, arr2, mergeArray);
        System.out.println("Merged array: ");
        for(int i : mergeArray){
            System.out.print(i + " ");
        }
    }
}
