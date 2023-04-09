import java.util.Objects;

import javax.lang.model.util.ElementScanner14;

public class Employee {
    public int emp_id;
    public String name;

    public Employee(int e, String n) {
        emp_id = e;
        name = n;
    }

    @Override
    public String toString() {
        return (this.emp_id + " " + this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Employee e = (Employee) obj;
        return emp_id == e.emp_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_id);
    }
}
