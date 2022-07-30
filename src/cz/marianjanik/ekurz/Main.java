package cz.marianjanik.ekurz;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari","Testarossa", 280000,290);
        Car car2 = new Car("Volvo","S80", 170000,230);
        Car car3 = new Car("Lancia","Thema", 120000,220);
        Car car4 = new Car("Audi","A6", 152634,240);
        Car car5 = new Car("Bentley","Continental GT", 321000,320);
        Car car6 = new Car("Maserati","Quadroporte", 45000,280);
        Car car7 = new Car("Trabant","combi", 450000,160);
        Car car8 = new Car("Ferrari","SF90 STRADALE", 10000,340);

        ListCars myList = new ListCars();

        myList.addCar(car1);
        myList.addCar(car2);
        myList.addCar(car3);
        myList.addCar(car4);
        myList.addCar(car5);
        myList.addCar(car6);
        myList.addCar(car7);
        myList.addCar(car8);

        System.out.println("The number of cars: " + myList.countCarsInList());
        System.out.println("The highest car speed: " + myList.maxSpeed() + " - " + myList.maxSpeed2()
                + ", with condition <300: " + myList.maxSpeed200_299());
        System.out.println("The slowest car: " + myList.minSpeed() + ", with condition >200: " + myList.minSpeed200_299());
        System.out.println("The average car speed: " + myList.averageSpeed() + ", Ferrari: " + myList.averageSpeedFerrari());

        System.out.println("Total mileage of all cars: " + myList.sumMileageKm());

        System.out.println();
        System.out.println(myList.writeName());
        System.out.println();
        System.out.println(myList.writeAll());
    }
}
