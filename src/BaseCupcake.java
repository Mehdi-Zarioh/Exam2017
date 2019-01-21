public abstract class BaseCupcake implements Cupcake {
    protected String description;
    protected double cost;

    @Override
    public String toString() {
        return "Description : "+this.description+"\nCoût : "+this.cost;
    }

    @Override
    public void addDescription(String a) {
        this.description+=a;
    }

    @Override
    public void addCost(double a) {
        this.cost+=a;
    }
}
