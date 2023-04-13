
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов Иван");
        nameBook.put(1, "Петров Петр");
        nameBook.put(3, "Сидоров Сидор");
        get(phoneBook, nameBook);
        
    }

    public static void get(Map<Integer, ArrayList<String>> phoneBook, Map<Integer, String> nameBook){
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i< nameBook.size(); i++){
                if (phoneBook.get(i)==null){
                phoneBook.put(i, new ArrayList<String>());
                System.out.print(nameBook.get(i)+" "+"Введите номер 1 ");
                String string = scanner.nextLine();
                System.out.print(nameBook.get(i)+" "+"Введите номер 2 ");
                String string2 = scanner.nextLine();
                phoneBook.get(i).add(string);
                phoneBook.get(i).add(string2);
                System.out.println("Телефонные номера абонента"+" "+nameBook.get(i)+" :"+phoneBook.get(i));
            
            }
         
        }
        
    }



}
