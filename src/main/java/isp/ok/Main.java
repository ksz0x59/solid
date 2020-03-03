package isp.ok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IEater humanOne = new Human();
        IEater humanTwo = new Human();

        IWorker robotOne = new Robot();
        IWorker robotTwo = new Robot();

        List<IWorker> workers = new ArrayList<>();
        workers.add(robotOne);
        workers.add(robotTwo);

        List<IEater> eaters = new ArrayList<>();
        eaters.add(humanOne);
        eaters.add(humanTwo);

        Factory factory = new Factory(workers);
        factory.manage();

        Canteen canteen = new Canteen(eaters);
        canteen.manage();

    }
}
