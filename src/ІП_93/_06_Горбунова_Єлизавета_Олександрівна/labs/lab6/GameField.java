package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GameField {
    private static GameField instance;
    private static HashMap<String, List<Integer>> castles = new HashMap<>();
    private static HashMap<String, List<Integer>> positions = new HashMap<>();

    public static boolean XYTaken(int x, int y) {
        ArrayList<Integer> xy = new ArrayList<>();
        xy.add(x);
        xy.add(y);
        if (positions.containsValue(xy)) return true;
        else return false;
    }
    public static void XYPut(String name, int x, int y) {
        ArrayList<Integer> XY = new ArrayList<>();
        XY.add(x);
        XY.add(y);
        if (positions.containsKey(name)) positions.replace(name, XY);
        else positions.put(name, XY);
    }

    public static void buildCastle(String name, ArrayList<Integer> position) {
        if(castles.containsValue(position)) castles.replace(name, position);
        else castles.put(name, position);
    }

    public static void removePosition(String name) {
        if(positions.containsKey(name)) {
            positions.remove(name);
            castles.remove(name);
        }
    }
}
