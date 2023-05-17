package Ex28_RepeatingNumbersFinder;
public class RepeatingNumbersFinder {
    // finds same number
    static boolean isFind(int[] arr,int value){
        for (int i: arr){
            if ( i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // created array and variable
        int[] list = {21,45,16,2,21,45,2,86,56,32,32,34,76,61,16,161};
        int[] duplicatedList = new int[list.length];
        int startIndex = 0;
        // finds repeating even numbers by searching the whole array
        for (int i= 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(list[i] % 2 == 0){
                        if(!isFind(duplicatedList, list[i]))
                            duplicatedList[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        // prints a string of repeating numbers to the screen -> without null values
        for(int value : duplicatedList){
            if(value != 0)
                System.out.println(value);
        }
    }
}
