package university.lesson2;

import java.util.*;

public class City {
    private String title;
    private Map<City, Integer> roadsToCity = new HashMap<>();
    City(String title){
        this.title = title;
    }
    City(String title, Map<City, Integer> roads){
        this(title);
        roadsToCity = roads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.equals("")){
            throw new IllegalArgumentException("Недопустимое название города!");
        }
        this.title = title;
    }
    public void addRoadToCity(City city, int roadLength){
        if(city != null && roadLength > 0 && !roadsToCity.containsKey(city)){
            roadsToCity.put(city, roadLength);
        }
    }
    public void removeRoadToCity(City city){
        if(city == null){
            throw new NullPointerException("Пустая ссылка!");
        }
        roadsToCity.remove(city);
    }
    public String showRoadsToCity() {
        String roads = "";
        for(Map.Entry c : roadsToCity.entrySet()){
            roads = roads + c.getKey() + ": " + c.getValue();
            roads += "\n";
        }
        return roads;
    }
    public HashMap<City, Integer> getRoadsToCity(){
        return new HashMap<>(roadsToCity);
    }

    @Override
    public String toString() {
        return title + ": \n" + showRoadsToCity();
    }
}
