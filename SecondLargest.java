public class SecondLargest {
    static int getSecondLargest(int arr[]){
        int largest = -1;
        int secondLargest = -1;
        for(int i : arr){
            if(i > largest){
                secondLargest = largest;
                largest = i;

            }else if(i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int arr[] = {2, 43, 6, 34, 95, 7};
        System.out.println("Second Largest value : " + getSecondLargest(arr));
    }
}
