package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
       String name = "Devender";
       char target = 'l'; 
       System.out.println(linear_search_in_string(name, target));
    }
    static boolean linear_search_in_string (String name , char target){
        if (name.length() == 0){
            return false;
        }
        for (int i=0;i<name.length();i++){
            if (name.charAt(i) == target ){
                return true;
            }
        }
        return false ;
    } 
}
