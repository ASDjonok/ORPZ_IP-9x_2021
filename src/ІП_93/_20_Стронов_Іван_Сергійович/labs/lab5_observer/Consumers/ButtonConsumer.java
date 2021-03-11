package ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Event;

public class ButtonConsumer implements Consumer {
    @Override
    public void update(Event e) {
        System.out.println("Event triggered on Button! Position: " + e.point.x + " " + e.point.y);
    }
}
