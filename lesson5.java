import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class lesson5 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phonebook = new HashMap<String, ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        addContact(phonebook, list);
        addContact(phonebook, list);
        addContact(phonebook, list);
        showContacts(phonebook, list);
    }

    public static void addContact(Map<String, ArrayList<String>> phonebook, ArrayList<String> list){
        ArrayList<String> archive = new ArrayList<String>();
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (phonebook.containsKey(name)) {
            System.out.println("Введите номер");
            String number = sc.nextLine();
            phonebook.get(name).add(number);

        }else{
            System.out.println("Введите номер");
            String number = sc.nextLine();
            archive.add(number);
            phonebook.put(name, archive);
        }
        
        
    }
    
    public static void showContacts(Map<String, ArrayList<String>> phonebook, ArrayList<String> list){
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry entry: phonebook.entrySet()){

            map.put(entry.getValue().toString().length(), entry.getKey().toString());
        }
        for (Map.Entry entry: map.entrySet()){
            System.out.print(entry.getValue());
            System.out.println(phonebook.get(entry.getValue()));
        }
        map.clear();
    }

    public static void deleteContact(Map<String, ArrayList<String>> phonebook){
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        phonebook.remove(name);
    }
}
