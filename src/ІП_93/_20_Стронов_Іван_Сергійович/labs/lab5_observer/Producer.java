package ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer;

public class Producer {
    Observer manager = new Observer();

    void onClick(int x, int y) {
        manager.notify("click", new Event(x, y));
    }
    void onDrag(int x, int y) {
        manager.notify("drag", new Event(x, y));
    }
    void onTouch(int x, int y) {
        manager.notify("touch", new Event(x, y));
    }
}
