package cz.marianjanik.ekurz;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;

public class ListCars {

    private List<Car> myList = new ArrayList<>();

    public void addCar(Car addCar) {
        myList.add(addCar);
    }

    public void removeCar(Car removeCar) {
        myList.remove(removeCar);
    }

    public int countCarsInList() {
        return myList.size();
    }

    public int maxSpeed() {
        return myList.stream().mapToInt(x -> x.getMaximalSpeed()).max().getAsInt();
    }

    public int maxSpeed2() {
        int max=0;
        for (Car car:myList) {
            if (max<car.getMaximalSpeed()) max=car.getMaximalSpeed();
        }
        return max;
    }

    public int minSpeed() {
        return myList.stream().mapToInt(x -> x.getMaximalSpeed()).min().getAsInt();
    }

    public int sumMileageKm() {
        return myList.stream().mapToInt(x -> x.getDistanceTraveled()).sum();
    }

    public double averageSpeed() {
        return myList.stream().mapToDouble(x -> x.getMaximalSpeed()).average().getAsDouble();
    }

    public String writeName() {
        StringBuilder builder = new StringBuilder();
        myList.forEach(x -> builder.append(x.getName() + ", "));
        return builder.toString();
    }

    public String writeAll() {
        StringBuilder builder = new StringBuilder();
        myList.forEach(x -> builder.append(x.getName() + " " + x.getType() + " - "
                        + x.getMaximalSpeed() + ", " + x.getDistanceTraveled() + lineSeparator()));
        return builder.toString();
    }
}
