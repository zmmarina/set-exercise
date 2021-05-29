package com.zmonteiro;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Set<Color> colors = new HashSet(){{
            add(new Color("red"));
            add(new Color("orange"));
            add(new Color("yellow"));
            add(new Color("green"));
            add(new Color("blue"));
            add(new Color("indigo"));
            add(new Color("violet"));
        }};

        for(Color color : colors){
            System.out.println(color);
        }

        System.out.println("----xx------xx----");
        System.out.println(colors.size() + " colors");
        System.out.println("----xx------xx----");

        Set<Color> alfabeticColors = new TreeSet<>(colors);
        for (Color color : alfabeticColors){
            System.out.println(color);
        }
        System.out.println("----xx------xx----");

        List<Color> colorsList = new ArrayList<>(colors);
        Comparator<Color> comp = (cl1, cl2) -> cl1.compareTo(cl2);
        List<Color> reversedColorsList = colorsList.stream()
                .sorted(comp.reversed())
                .collect(Collectors.toList());
        Set<Color> reversedColorsSet = new LinkedHashSet(reversedColorsList);

        for(Color color : reversedColorsSet){
            System.out.println(color);
        }
        System.out.println("----xx------xx----");

        for(Color color : reversedColorsSet){
            if(color.getName().charAt(0) == 'v'){
                System.out.println(color);
            }
        }
        System.out.println("----xx------xx----");

        Predicate<Color> pred = cl -> cl.getName().charAt(0) != 'v';
        reversedColorsSet.removeIf(pred);
        for(Color color : reversedColorsSet){
                System.out.println(color);
        }
        System.out.println("----xx------xx----");

        reversedColorsSet.clear();
        System.out.println(reversedColorsSet.isEmpty());







    }
}
