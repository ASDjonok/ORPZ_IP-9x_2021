package ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer;

import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers.ButtonConsumer;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers.Consumer;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers.TextFieldConsumer;
import ІП_93._20_Стронов_Іван_Сергійович.labs.lab5_observer.Consumers.WindowConsumer;

public class Main {
    public static void main(String[] args) {
        Consumer window = new WindowConsumer();
        Consumer textField = new TextFieldConsumer();
        Consumer button = new ButtonConsumer();

        Producer frame = new Producer();
        frame.manager.subscribe("click", window);
        frame.manager.subscribe("drag", window);
        frame.manager.subscribe("click", button);
        frame.manager.subscribe("touch", button);

        frame.onClick(100, 100);
        frame.onDrag(200, 300);

        frame.manager.subscribe("click", textField);
        frame.manager.unSubscribe("click", window);

        frame.onClick(0, 0);
        frame.onTouch(10, 20);
    }
}
