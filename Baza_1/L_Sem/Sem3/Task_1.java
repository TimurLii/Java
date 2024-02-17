package Baza_1.L_Sem.Sem3;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> planetList = new ArrayList<String>();
        planetList.add("Земля");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Марс");
        planetList.add("Марс");
        planetList.add("Венера");


        System.out.println(solarSystem(planetList));
        deleteWord(planetList);
    }

    public static List<String> solarSystem(List<String> arg) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arg.size(); i++) {
            if (!result.contains(arg.get(i))) {
                result.add(arg.get(i));
                int count = 0;
                for (int j = 0; j < arg.size(); j++) {
                    if (arg.get(i).equals(arg.get(j))) {
                        count++;
                    }
                }
                sb.append(arg.get(i))
                        .append(" : ")
                        .append(count)
                        .append(" ");
//                result.add(String.valueOf(sb));
            }

        }
        return List.of(sb.toString().split(","));
    }
    public static void deleteWord(List<String> planet){
        planet.sort(String::compareTo);
        for(int i = 1; i < planet.size(); i++){
            if(planet.get(i).equals(planet.get(i-1))){
                planet.remove(i);
                i--;
            }
        }
        System.out.println(planet);
    }

}
