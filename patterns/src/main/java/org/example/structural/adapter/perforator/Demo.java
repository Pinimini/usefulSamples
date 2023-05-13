package org.example.structural.adapter.perforator;

public class Demo {

    public static void main(String[] args) {
        new Demo().usePattern();
        new Demo().alternative();
    }

    private void usePattern() {
        RotaryHummer rotaryHummer = new RotaryHummer();
        Drill drill = new Drill();
        // Используем сверло через адаптер
        rotaryHummer.drill(new SDSAdapter(drill));
    }

    private void alternative() {
        RotaryHummer rotaryHummer = new RotaryHummer();
        Drill drill = new Drill();
        // В нашем простом примере можно использовать и просто лямбду
        rotaryHummer.drill(() -> System.out.println(drill));
    }
}
