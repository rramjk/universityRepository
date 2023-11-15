package university.lesson2.points;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class SmartPoint {
    private final List<Attribute> attributeList;
    public SmartPoint(Attribute ... attributes){
        attributeList = Arrays.asList(attributes);
        if(attributeList.get(0).getClass() != Coordinate.class) throw new IllegalArgumentException("Первый аргумент координата");
    }

    public Object getParametr(Class<?> attributeClass, String nameOfParametr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for(Attribute attribute : attributeList){
            if(attribute.getClass() == attributeClass){
                Method method = attribute.getClass().getMethod("get"+nameOfParametr);
                return method.invoke(attribute);
            }
        }
        return null;
    }

    public String toString(){
        StringBuilder pointToString = new StringBuilder();
        for(Attribute attribute : attributeList){
            pointToString.append(attribute.attributeToString()).append(", ");
        }
        return pointToString.delete(pointToString.length()-2, pointToString.length()).toString();
    }
}
