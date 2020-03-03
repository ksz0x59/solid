package isp.ok;

import java.util.List;

public class Canteen
{
    private List<IEater> eaters;

    public Canteen(List<IEater> eaters) {
        this.eaters = eaters;
    }

    public void manage()
    {
        for (IEater worker : eaters) {
            System.out.println(worker.eat());
        }
    }

}
