package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;
import myPackage.MyInterface;
import myPackage.MyList;
import myPackage.MyOtherClass;
import myPackage.SeaBoatHeir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args/*, List list1*/) throws CloneNotSupportedException {
        /*int[] array = new int[4];
        System.out.println(array.length);*/

        /*ArrayList arrayList = new ArrayList<String>();
        ArrayList<String> arrayListString = arrayList;
        List list = arrayList;
        list = arrayListString;
        arrayList.add(1);
//        arrayListString.add(1);
        arrayList = new ArrayList<Integer>();
        arrayList.add("A");

        MyList seaBoats = new MyList();

//=========

        seaBoats.add(new SeaBoat(1,1,"A"));
        arrayListString.add("A");


        List<List<?>> lists = new ArrayList<>();
        lists.add(seaBoats);
        lists.add(arrayListString);


//        ----
        String searchString = "A";
        lists.forEach(objects -> objects.contains(searchString));
//        lists.forEach(objects -> objects.add(searchString));
//        ----

//        =========

        SeaBoat seaBoat = new SeaBoatHeir(1,1,"A");
        SeaBoatHeir seaBoatHeir = (SeaBoatHeir) seaBoat;
        seaBoatHeir.myMethod3();*/
//        seaBoat.myMethod3();

        /*int a = Integer.MAX_VALUE;
        System.out.println(a);
        a++;
        System.out.println(a);*/
//        SeaBoat[] seaBoats = new SeaBoat[3];
//        SeaBoat seaBoats[] = new SeaBoat[3];
//        var seaBoats = new SeaBoat[3];
//        var seaBoats = {new SeaBoat()};
        SeaBoat[] seaBoats = {
                new SeaBoat(2, 1, "C"),
                new SeaBoat(1, 1, "C"),
                new SeaBoat(1, 2, "A"),
        };

//        System.out.println(seaBoats[0] < seaBoats[1]);
//        System.out.println(seaBoats[0].compareTo(seaBoats[1]));
//        System.out.println(seaBoats[0].compareTo("A"));
/*        System.out.println(seaBoats[0].hashCode());
        System.out.println(seaBoats[0].clone().hashCode());
        System.out.println(seaBoats[1].hashCode());*/
//        System.out.println(seaBoats[0] == seaBoats[1]);
//        System.out.println(seaBoats[0].equals(seaBoats[1]));
//        SeaBoat o = null;
//        System.out.println(o.equals(seaBoats[1]));

//        Arrays.sort(seaBoats);
        System.out.println(Arrays.toString(seaBoats));
        /*ToIntFunction<SeaBoat> getCruisingSpeed1 = SeaBoat::getCruisingSpeed;
        ToIntFunction<SeaBoat> getCruisingSpeed3 = a -> a.getCruisingSpeed();
        Function<SeaBoat, Integer> getCruisingSpeed2 = SeaBoat::getCruisingSpeed;
        Comparator<SeaBoat> comparator0 = Comparator.comparingInt(getCruisingSpeed1);
        Comparator<SeaBoat> comparator = (o1, o2) -> o1.getCruisingSpeed() - o2.getCruisingSpeed();
        Comparator<SeaBoat> comparator2 = new Comparator<SeaBoat>() {
            @Override
            public int compare(SeaBoat o1, SeaBoat o2) {
                return o1.getCruisingSpeed() - o2.getCruisingSpeed();
            }
        };*/
        Arrays.sort(seaBoats, Comparator.comparingInt(SeaBoat::getCruisingSpeed).thenComparing(SeaBoat::getName));
//        Arrays.sort(seaBoats, (o1, o2) -> o1.getCruisingSpeed() - o2.getCruisingSpeed());
        /*Arrays.sort(seaBoats, new Comparator<SeaBoat>() {
            @Override
            public int compare(SeaBoat o1, SeaBoat o2) {
                return o1.getCruisingSpeed() - o2.getCruisingSpeed();
            }
        });*/
        System.out.println(Arrays.toString(seaBoats));
        Arrays.sort(seaBoats, new NameComparator().reversed());
        /*Arrays.sort(seaBoats, new Comparator<SeaBoat>() {
            @Override
            public int compare(SeaBoat o1, SeaBoat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.reversed());*/
        System.out.println(Arrays.toString(seaBoats));

        /*MyInterface myInterface = new SeaBoatHeir(1, 1, "A");
        System.out.println("int = " + myInterface.getInt());
        myInterface = new MyOtherClass();
        System.out.println("int = " + myInterface.getInt());


        SeaBoatHeir seaBoatHeir = new SeaBoatHeir(1, 1, "A");*/
//        seaBoatHeir.clone();
        /*SeaBoat seaBoat = new SeaBoatHeir();
        seaBoat.myMethod();
        seaBoat = new SeaBoat(1, 1, "A");
        seaBoat.myMethod();*/
//        seaBoatHeir.myMethod();
//        seaBoatHeir.cruisingSpeed = 3;
        System.out.println("Done!");
    }
}
