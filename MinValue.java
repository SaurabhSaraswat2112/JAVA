public class MinValue {
   
   public static void main(String[] var0) {
      int[] arr = new int[]{3, 5, 7, 2, 8, 1};
      int min = arr[0];
      

      for(int i : arr) {
         
         if (i < min) {
            min = i;
         }
      }

      System.out.println("Minimum value : " + min);
   }
}

