import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PowerfulSet {
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2){
        return set1.stream().filter(set2::contains).collect(Collectors.toSet());
    }
    public static<T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }
    public static <T> Set<T> relativeComplement(Set<T> set1, Set<T> set2){
        return set1.stream().filter(t -> !set2.contains(t)).collect(Collectors.toSet());
    }
}
