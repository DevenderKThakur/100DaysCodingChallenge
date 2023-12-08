package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int target = 3 ;
        System.err.println(search_in_range(arr, target, 1, 4));
    }
    static boolean search_in_range(int [] arr, int target , int start , int end ){
        if (arr.length == 0){
            return false ;
        }
        for (int i= start ;i<=end;i++){
            if (arr[i] == target ){
                return true ;
            }
        }
        return false ;
    }
}
