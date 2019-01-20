public abstract class Decorator implements Cupcake{
    private Cupcake tempCupcake;

    public Decorator(Cupcake newCupcake){
        this.tempCupcake=newCupcake;
    }

    @Override
    public String toString() {
        return tempCupcake.toString();
    }

    @Override
    public void addDescription(String a) {
        this.tempCupcake.addDescription(a);
    }

    @Override
    public void addCost(double a) {
        this.tempCupcake.addCost(a);
    }
}
