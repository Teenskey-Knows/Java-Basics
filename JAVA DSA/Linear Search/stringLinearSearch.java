
public class stringLinearSearch {
    


    public static void main(String[] args) {
        

        String stringToIterate = "Yooh Wassup";
        char charToFind = 'o';

        System.out.println(searchString(stringToIterate,charToFind));
    }



   static boolean searchString(String array, char target){

    if (array.length()==0){
        return false;
    }

    for (char character: array.toCharArray()){
        if (character == target){
            return true;
        }
    }
        return true;
    }



}
