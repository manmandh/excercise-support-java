package interfaceFolder;
public class Software implements InterfaceCalculator, InterfaceSort{
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

    @Override
    public void ascendingSort(double[] arr) {
        //khai bao bien
        int n = arr.length;
        double value;
        int i,j;
        for(i=1; i<n; i++) {
            value = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    @Override
    public void descendingSort(double[] arr) {
        int n = arr.length;
        double value;
        int i,j;
        for(i=1; i<n; i++) {
            value = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] < value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }
}
