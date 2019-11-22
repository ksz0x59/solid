package lsp.ok;

import lsp.Politician;

import java.util.ArrayList;
import java.util.List;

public class GovernmentService {
    private static final double JUST_ENOUGH_TO_FORCE_X = 2000;

    private List<Politician> politicianRepository;

    public GovernmentService(List<Politician> politicians)
    {
        politicianRepository = politicians;
    }

    public void forceX() {
        for (Politician politician : politicianRepository) {
            politician.bribe(JUST_ENOUGH_TO_FORCE_X);
        }
    }

    public static void main(String[] args) {
        List<Politician> politicianList = new ArrayList<>();
        politicianList.add(new Politician("Tusk"));
        politicianList.add(new CorruptiblePolitician("Schetyna"));
        politicianList.add(new CorruptiblePolitician("Pitera"));

        new GovernmentService(politicianList).forceX();
    }
}
