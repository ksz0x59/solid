package isp.bad;

import java.util.List;

public class Factory
{
    private List<Worker> workers;

    public Factory(List<Worker> workers)
    {
        this.workers = workers;
    }

    public void manage()
    {
        for (Worker worker : workers) {
            System.out.println(worker.work());
        }
    }

}
