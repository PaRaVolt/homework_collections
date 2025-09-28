import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean IsAnagramma(String s1, String s2){
        boolean result = true;
        if(s1.equals(s2)){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }

        int[] is1 = s1.toLowerCase().chars().sorted().toArray();
        int[] is2 = s2.toLowerCase().chars().sorted().toArray();
        for(int i =0;i<is1.length;i++){
            if(is1[i] != is2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        String str1 = src.nextLine();
        String str2 = src.nextLine();
        if(IsAnagramma(str1, str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}