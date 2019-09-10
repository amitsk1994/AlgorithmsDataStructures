package sort;

public class InsertionSort {
   public static void sort(int numbers [], int numbersSize) {
      int i;
      int j;
      int temp;      // Temporary variable for swap

      for (i = 1; i < numbersSize; ++i) {    //n+1
         j = i;    //n
         // Insert numbers[i] into sorted part 
         // stopping once numbers[i] in correct position
         while (j > 0 && numbers[j] < numbers[j - 1]) {   //nn

            // Swap numbers[j] and numbers[j - 1]
            temp = numbers[j];  //n(n-1)
            numbers[j] = numbers[j - 1]; //n(n-1)
            numbers[j - 1] = temp; //n(n-1)
            --j; //n(n-1)
         }
      }
   }

   public static void main(String [] args) {
      int numbers [] = {10, 2, 78, 4, 45, 32, 7, 11};
      final int NUMBERS_SIZE = 8;
      int i;

      System.out.print("-----------Insertion Sort---------\nUNSORTED: ");
      for (i = 0; i < NUMBERS_SIZE; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      /* initial call to quicksort with index */
      sort(numbers, NUMBERS_SIZE);

      System.out.print("SORTED: ");
      for (i = 0; i < NUMBERS_SIZE; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();
   }
}
