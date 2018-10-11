package coordinate.study;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> cars;
    private RentCompany() {
        this.cars = new ArrayList<>();
    }
    public static RentCompany create(){
        return new RentCompany();
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public String generateReport(){
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName());
            sb.append(" : ");
            sb.append((int)car.getChargeQuantity());
            sb.append("리터");
            sb.append(NEWLINE);
        }
        return sb.toString();
    }
}
