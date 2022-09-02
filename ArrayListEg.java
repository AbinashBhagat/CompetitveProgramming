import java.util.ArrayList;

public class ArrayListEg {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList();
        names.add("Abhi");
        names.add("Ashutosh");
        names.add("Aishwarya");
        names.add("Akanksha");

    for(String name: names){
        System.out.println(name);
    }
    }
}
