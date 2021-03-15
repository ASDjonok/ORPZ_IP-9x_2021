package ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers.Consumer;

import java.util.ArrayList;
import java.util.HashMap;

public class Observer {
    HashMap<String, ArrayList<Consumer>> listeners = new HashMap<>();

    void notify(String eventName, Event event) {
        var list = listeners.get(eventName);
        if (list == null) return;
        list.forEach(c -> c.update(event));
    }
    void subscribe(String eventName, Consumer listener) {
        var list = listeners.get(eventName);
        if (list != null) {
            list.add(listener);
            return;
        }
        var newList = new ArrayList<Consumer>();
        newList.add(listener);
        listeners.put(eventName, newList);
    }
    void unSubscribe(String eventName, Consumer listener) {
        var list = listeners.get(eventName);
        if (list != null)
            list.remove(listener);
    }
}
