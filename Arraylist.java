import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<>();
        arrl.add("Saad");
        arrl.add("Aziz");

        arrl.add(0, "Muhammad");

        System.out.println(arrl.get(0));

        arrl.remove(2);
        arrl.remove("Saad");
        System.out.println(arrl);
    }

}