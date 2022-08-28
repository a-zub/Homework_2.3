// Homework_2.3
// @ Aleksandar Zubanov
// 2022


public class Car extends Vehicle implements WheelReplacement, EngineService {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль: " + getModelName());
        checkWheels();
        checkEngine();
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобилю");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}