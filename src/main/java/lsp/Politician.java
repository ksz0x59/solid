package lsp;

public class Politician {
    String name;

    public Politician(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Politician{" +
                "name='" + name + '\'' +
                '}';
    }

    public void bribe(double dollars) {
        if (dollars < 2000)
            throw new HowDareYouException();
        changeMindAboutX();
    }

    protected void changeMindAboutX()
    {
        System.out.println("Changing mind about X");
    }
}
