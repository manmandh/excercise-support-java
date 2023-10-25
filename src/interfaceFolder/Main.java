package interfaceFolder;

public class Main {
    public static void main(String[] args) {
        //Cau a
        System.out.println("Sentence a: ");
        CalculatorCasioFx500 calculatorCasioFx500 = new CalculatorCasioFx500();
        CalculatorCasioVinacal calculatorCasioVinacal = new CalculatorCasioVinacal();

        System.out.println("16+21=" + calculatorCasioFx500.add(16,21));
        System.out.println("43-5=" + calculatorCasioVinacal.sub(43,5));
        System.out.println("2*4=" + calculatorCasioVinacal.multiple(2,4));
        System.out.println("0/7=" + calculatorCasioFx500.divide(0,7)) ;

        //Cau b
        System.out.println("Sentence b: ");
        double[] arr = new double[] {5,1,4,3,8,5,0};
        double[] arr2 = new double[] {6,7,2,9,4,5,2};
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();

        insertionSort.ascendingSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

        selectionSort.descendingSort(arr2);
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]+ " ");
        }
        System.out.println();

        //cau c
        Software software = new Software();
        System.out.println("16+9=" + software.add(16,9));
        double[] arr3 = new double[] {6,2,7,9,2,4,5};
        software.ascendingSort(arr3);
        for(int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]+ " ");
        }

    }
}
