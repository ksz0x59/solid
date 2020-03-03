package isp.ok;

import java.util.List;

public class Factory
{
    private List<IWorker> workers;

    public Factory(List<IWorker> workers) {
        this.workers = workers;
    }

    public void manage()
    {
        for (IWorker worker : workers) {
            System.out.println(worker.work());
        }
    }

}
