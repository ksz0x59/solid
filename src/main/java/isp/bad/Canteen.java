package isp.bad;

import java.util.List;

public class Canteen
{
    private List<Worker> workers;

    public Canteen(List<Worker> workers)
    {
        this.workers = workers;
    }

    public void manage()
    {
        for (Worker worker : workers) {
            System.out.println(worker.eat());
        }
    }

}
