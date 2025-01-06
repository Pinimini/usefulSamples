package org.example.behavioral.command;

public class Demo {

    public static void main(String[] args) {
        SomeObject object = new SomeObject("initVal");
        Executor executor = new Executor(object);

        //Нужную операцию инкапсулируем в отдельный класс
        executor.addCommand(new AdderABC());
        executor.addCommand(new Echo());
        executor.addCommand(new AdderABC());

        //Можно выполнить отложенно
        executor.executeCommand();

        System.out.println("result object:" + object);
    }
}
