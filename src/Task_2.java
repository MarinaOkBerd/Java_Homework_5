import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "Иван Иванов","Светлана Петрова","Кристина Белова","Анна Мусина",
            "Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов",
            "Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина",
            "Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников",
            "Петр Петин","Иван Ежов");

     
        List<String> firstNames = new ArrayList<>();
        for(String name: names){
            String firstName = name.substring(0, name.indexOf(" "));
            firstNames.add(firstName);

        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String firstName : firstNames) {
            if (!map.containsKey(firstName)) {
                if (Collections.frequency(firstNames, firstName) > 1) {
                    map.put(firstName, Collections.frequency(firstNames, firstName));
                }
            }
        }
        
        int values;
        String Keys;
            
        ArrayList<Integer> listValues = new ArrayList<Integer>(map.values());
        ArrayList<String> listKeys = new ArrayList<String>(map.keySet());
        for (int i = 0; i < listValues.size(); i++) {
            for (int j = 1; j < listValues.size(); j++) {
                if (listValues.get(j) > listValues.get(j-1)) {
                    values = listValues.get(j-1);
                    listValues.set((j-1),listValues.get(j));
                    listValues.set((j),values);
                    Keys = listKeys.get(j-1);
                    listKeys.set((j-1),listKeys.get(j));
                    listKeys.set((j),Keys);
                }
            }
        }
        
        for (int i = 0; i < listValues.size(); i++) {
            System.out.println(listKeys.get(i) + " " +  listValues.get(i));
        }    


    }





    
}
