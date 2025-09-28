import java.util.*;

import static java.util.Collections.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static <T> Set<T> GetUnique(ArrayList<T> in){
//        return arr_in.stream().sorted().distinct().toList();
        return new HashSet<T>(in);
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> listAll = new ArrayList<String>(Arrays.asList("CO2", "CH4", "SO2", "CO2", "CH4", "SO2", "CO2", "CH4", "SO2"));
        Set<String> listOut = GetUnique(listAll);

        for(String s : listOut){
            System.out.println(s);
        }
    }
}