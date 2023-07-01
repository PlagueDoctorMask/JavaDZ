/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

import java.util.ArrayList;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        System.out.println("Введите имя или нажмите 'enter' в случае его отсутствия" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name != "") {
            list.add("name="+name);
        }
        System.out.println("Введите страну или нажмите 'enter' в случае её отсутствия" );
        String country = sc.nextLine();
        if (country != "") {
            list.add("country="+country);
        }
        System.out.println("Введите город или нажмите 'enter' в случае её отсутствия" );
        String city = sc.nextLine();
        if (city != "") {
            list.add("city="+city);
        }
        System.out.println("Введите возраст или нажмите 'enter' в случае её отсутствия" );
        String age = sc.nextLine();
        if (age != "") {
            list.add("age="+age);
        }
        StringBuilder sb = new StringBuilder("select * from students where ");
        for (int i = 0; i < list.size(); i++) {
            sb.append("'");
            sb.append(list.get(i));
            sb.append("'");
            sb.append(" and ");
        }
        sb.delete(sb.length()-4, sb.length());
        System.out.println(list);
        System.out.println(sb);
    }
}
