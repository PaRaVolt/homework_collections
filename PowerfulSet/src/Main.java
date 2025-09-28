import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Set<Integer> inters_ = PowerfulSet.intersection(Set.of(1, 2, 3), Set.of(0, 1, 2, 4));
        System.out.println("intersection of {1, 2, 3} and {0, 1, 2, 4}:");
        for(Integer i : inters_){
            System.out.println(i);
        }

        Set<Integer> union_ = PowerfulSet.union(Set.of(1, 2, 3), Set.of(0, 1, 2, 4));
        System.out.println("union of {1, 2, 3} and {0, 1, 2, 4}:");
        for(Integer i : union_){
            System.out.println(i);
        }

        Set<Integer> relative_ = PowerfulSet.relativeComplement(Set.of(1, 2, 3), Set.of(0, 1, 2, 4));
        System.out.println("relativeComplement of {1, 2, 3} and {0, 1, 2, 4}:");
        for(Integer i : relative_){
            System.out.println(i);
        }
    }
}