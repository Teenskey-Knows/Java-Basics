
// The  function below is just for searching elements in range;
public class SearchInRange {


    public static void main(String[] args) {
        int[] arr = {12,123,455,2,66,7,9};
        int target = 3;
        System.out.println(searchStringInRange(arr,target,3,4));
        
    }

    static int searchStringInRange(int[] array, int target, int start, int end){

        // if (array.length == 0){
        // return  -1;
        // }

        for (int index = start; index <= end; index++){
            int element = array[index];

            if (element == target){
                return index;
            }
        }

        return 1;
    }
    
}
