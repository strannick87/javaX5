package lesson4;

interface Startable {
    void start();
    int DEFAULT_SPEED = 100;
}

public interface Movable extends Startable{
    void forward();
    void back();
}

interface ILogger {
    default void log(String str){
        System.out.println("Метод по умолчанию. Логируем: " + str);
    }
}
class Logger implements ILogger{
    @Override
    public void log(String str) {
        System.out.println("Переопредеоенный метод. Логируем: " + str);
    }
}
