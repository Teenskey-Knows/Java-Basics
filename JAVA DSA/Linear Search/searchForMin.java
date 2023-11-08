

public class searchForMin {
    
    public static void main(String[] args) {
        
        int[] arrays = {3,5,7,0,5,3,5};
        System.out.println(minimumNumber(arrays));
    }


    static int minimumNumber(int[] array){

        int ans = array[0];

        for ( int startIndex = 0; startIndex < array.length; startIndex ++){
         
          if (array[startIndex] < ans){
            ans = array[startIndex];
          }
        }
        return ans;
    }
    
}
