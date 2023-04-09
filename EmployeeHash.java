import java.util.HashSet;
import java.util.Set;

public class EmployeeHash {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        set.add(new Employee(0, "Saad"));
        set.add(new Employee(1, "Saad"));

        set.add(new Employee(1, "Aziz"));

        System.out.println(set);
    }
}
