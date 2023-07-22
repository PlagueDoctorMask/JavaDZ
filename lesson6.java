import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lesson6 {
    public static void main(String[] args) {

        Map<String, Integer> Criteria = Map.of("Name", 1, "Cpu", 2, "Color", 3, "Ram", 4);

        ArrayList<laptop> list = new ArrayList<>();
        laptop laptop1 = new laptop("Asus", "Intel", "Black", 4);
        list.add(laptop1);
        laptop laptop2 = new laptop("Acer", "Amd", "White", 8);
        list.add(laptop2);
        laptop laptop3 = new laptop("Asus", "Amd", "Black", 4);
        list.add(laptop3);
        
        
        laptop.FilterByName(list, "Acer");
        laptop.FilterByCpu(list, "Intel");
        laptop.FilterByColor(list, "Black");
        laptop.FilterByRam(list, 8);

    }
    

}
