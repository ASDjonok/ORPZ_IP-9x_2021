package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;

import java.util.Comparator;

public class NameComparator implements Comparator<SeaBoat> {
    @Override
    public int compare(SeaBoat o1, SeaBoat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
