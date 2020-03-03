package isp.bad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker humanOne = new Human();
        Worker humanTwo = new Human();

        Worker robotOne = new Robot();
        Worker robotTwo = new Robot();

        List<Worker> workers = new ArrayList<>();
        workers.add(humanOne);
        workers.add(humanTwo);
        workers.add(robotOne);
        workers.add(robotTwo);

        Factory factory = new Factory(workers);
        factory.manage();

        Canteen canteen = new Canteen(workers);
        canteen.manage();

    }
}
