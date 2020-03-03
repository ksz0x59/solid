package lsp.second.ok;

import lsp.second.HowDareYouException;
import lsp.second.Politician;


public class CorruptiblePolitician extends Politician {
    public CorruptiblePolitician(String name) {
        super(name);
    }

    @Override
    public void bribe(double dollars) {
        if (dollars < 2000)
            throw new HowDareYouException();
        changeMindAboutX();
        if (dollars >= 3000)
            changeMindAboutY();
    }
    private void changeMindAboutY() {
        System.out.println("Changing mind about Y");
    }
}
