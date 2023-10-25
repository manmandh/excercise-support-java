package interfaceFolder;
public class CalculatorCasioFx500 implements InterfaceCalculator{

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

    @Override
    public double multiple(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }
}
