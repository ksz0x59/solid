package lsp.second.bad;


import lsp.second.HowDareYouException;
import lsp.second.Politician;

public class CorruptiblePolitician extends Politician {

    public CorruptiblePolitician(String name) {
        super(name);
    }

    @Override
    public void bribe(double dollars) {
        if (dollars < 3000)
            throw new HowDareYouException();
        changeMindAboutY();
    }
    private void changeMindAboutY() {
        System.out.println("changing mind about y");
    }
}
