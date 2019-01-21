import java.util.InputMismatchException;

public class CupcakeFactory {
    Cupcake createCupcake(int a){
        if (a == 1) {
            return new CupcakeV();
        } else if (a == 2) {
            return new CupcakeC();
        } else {
            throw new InputMismatchException();
        }
    }
}
