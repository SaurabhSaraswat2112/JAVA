public class MaxVal {
    public static void main(String[] args){
        int arr[] = {2, 43, 6, 34, 95, 7};
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println("Maximum value : " + max);
    }
}
