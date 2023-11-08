
/*
 # WHAT IS LINEAR SEARCH
 - Just searching in a linear manner


 TIME COMPLEXITY

 - LINEAR TIME COMPLEXITY - when time grows in relation to size.
 - Denoted by O(n).

- CONSTANT TIME COMPLEXITY -  regardless of size , the time taken to perform a certain operation remains the same.
- Denoted by O(1).

 */
public class linearSearch {

    public static void main(String[] args) {
        int[] nums = {2,3,5,848,3837,2740,83,2,0,857,3}; 
        int target = 209;

        int ans = searchArrayElement(nums, target);
        System.out.println(ans);
    }

    //search in the array
    // Return the index if the item found
    // Otherwise if item not found return -1

    static int searchArrayElement(int[] array, int target){

        if (array.length == 0){
            return -1;
        }

        for (int index=0; index < array.length; index++ ){
         if (array[index]== target){
            return index;
         }
        }

        return -1;
    }
    
}
  