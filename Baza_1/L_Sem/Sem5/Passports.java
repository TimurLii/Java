package Baza_1.L_Sem.Sem5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String pussNum, String lastName) {
        map.put(pussNum, lastName);
    }

    String getByPasNum(String passNum) {
        return passNum + ':' + map.get(passNum);
    }

    String getByLastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if(entry.getValue().equals(lastName)){
                stringBuilder.append(entry.getKey())
                        .append(':')
                        .append(entry.getValue())
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }
    String getAll( ){
        return map.toString();
    }

}
