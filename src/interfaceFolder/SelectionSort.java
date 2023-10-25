package interfaceFolder;
public class SelectionSort implements InterfaceSort{
    @Override
    public void ascendingSort(double[] arr) {
        int n = arr.length;
        int i,j, minIndex;
        for(i=0;i<n-1;i++){
            minIndex = i;
            for(j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = i;
                    double tmp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    @Override
    public void descendingSort(double[] arr) {
        int n = arr.length;
        int i,j, minIndex;
        for(i=0;i<n-1;i++){
            minIndex = i;
            for(j=i+1; j<n; j++){
                if(arr[j] > arr[minIndex]){
                    minIndex = i;
                    double tmp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
