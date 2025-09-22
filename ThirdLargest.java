public class ThirdLargest {
    static int getThirdLargest(int arr[]){
        int first = -1;
        int second = -1;
        int third = -1;
        for(int i : arr){
            if(i > first){
                third = second;
                second = first;
                first = i;
            }else if(i > second && i != first){
                third = second;
                second = i;
            }else if(i > third && i != second){
                third = i;
            }
        }
        return third;
    }
    public static void main(String[] args){
        int arr[] = {2, 43, 6, 34, 95, 7};
        System.out.println("Third Largest value : " + getThirdLargest(arr));
    }
}
