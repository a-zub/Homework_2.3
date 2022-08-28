// Homework_2.3
// @ Aleksandar Zubanov
// 2022


public class Bicycle extends Vehicle implements WheelReplacement {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед: " + getModelName());
        checkWheels();
    }

    @Override
    public void checkWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеду");
    }
}