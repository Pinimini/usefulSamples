package org.example.structural.adapter.perforator;

public class SDSAdapter implements SDSDrill {
    private final Drill drill;

    public SDSAdapter(Drill drill) {
        this.drill = drill;
    }

    @Override
    public void action() {
        // Адаптер не содержит логики
        // Он делегирует работу адаптируемым классам
        System.out.println(drill);
    }
}
