package src.test;
import java.util.Arrays;
public class arrEqual {

    void anagram(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("The strings are anagram");
        }
        else{
            System.out.println("The strings are not anagram");
        }
    }
    public static void main(String[] args) {
        String arr1[] = {"code","doce","framer","frame"};
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        arrEqual obj = new arrEqual();
        for(int i=1; i<arr1.length; i++){
            obj.anagram(arr1[0], arr1[i]);
        }
        
    }
}
