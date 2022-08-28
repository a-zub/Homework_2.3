// Homework_2.3
// @ Aleksandar Zubanov
// 2022

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 4);

        Vehicle bicycle = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        Vehicle truck1 = new Truck("truck1", 6);
        Vehicle truck2 = new Truck("truck2", 8);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck1);
        station.check(truck2);
    }
}

