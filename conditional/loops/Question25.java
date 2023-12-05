package conditional.loops;

public class Question25 {
    public static void main(String[] args) {
        int month = 31;
        int count = 0;
        for (int i=0;i<month;i++){
            if (i%2 == 0){
                count ++ ;
            }
        }
        System.out.println(count);
    }
    
}
