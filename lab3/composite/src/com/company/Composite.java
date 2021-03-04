package com.company;

import java.util.List;

public class Composite extends Component{
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(int index) {
        this.components.remove(index);
    }

    public List<Component> getChild() {
        return this.components;
    }
}
