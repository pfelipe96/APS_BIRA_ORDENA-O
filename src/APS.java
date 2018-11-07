public class APS {

    //Bubble Sort *, Selection Sort *, Insertion Sort , Heap Sort, Merge Sort, Quick Sort, Count Sort, Bucket Sort e Radix Sort

    public static void main(String args[]){
        CriarVetor returnVetor5 = new CriarVetor(5);
        CriarVetor returnVetor10 = new CriarVetor(10);
        CriarVetor returnVetor50 = new CriarVetor(50);
        CriarVetor returnVetor100 = new CriarVetor(100);
        CriarVetor returnVetor1000 = new CriarVetor(1000);
        CriarVetor returnVetor10000 = new CriarVetor(10000);

        //BubbleSort
        System.out.println("Vetor tamanho 5: " + bubbleSortOtimizado(returnVetor5.getVetorCriado()));
        System.out.println("Vetor tamanho 10: " + bubbleSortOtimizado(returnVetor10.getVetorCriado()));
        System.out.println("Vetor tamanho 50: " + bubbleSortOtimizado(returnVetor50.getVetorCriado()));
        System.out.println("Vetor tamanho 100: " + bubbleSortOtimizado(returnVetor100.getVetorCriado()));
        System.out.println("Vetor tamanho 1000: " + bubbleSortOtimizado(returnVetor1000.getVetorCriado()));
        System.out.println("Vetor tamanho 10000: " + bubbleSortOtimizado(returnVetor10000.getVetorCriado()));

        System.out.println("---------------------------------------------------");

        //SelectionSort
        System.out.println("Vetor tamanho 5: " + selectionSort(returnVetor5.getVetorCriado()));
        System.out.println("Vetor tamanho 10: " + selectionSort(returnVetor10.getVetorCriado()));
        System.out.println("Vetor tamanho 50: " + selectionSort(returnVetor50.getVetorCriado()));
        System.out.println("Vetor tamanho 100: " + selectionSort(returnVetor100.getVetorCriado()));
        System.out.println("Vetor tamanho 1000: " + selectionSort(returnVetor1000.getVetorCriado()));
        System.out.println("Vetor tamanho 10000: " + selectionSort(returnVetor10000.getVetorCriado()));

        System.out.println("---------------------------------------------------");

        //InsertionSort
        System.out.println("Vetor tamanho 5: " + insertionSort(returnVetor5.getVetorCriado()));
        System.out.println("Vetor tamanho 10: " + insertionSort(returnVetor10.getVetorCriado()));
        System.out.println("Vetor tamanho 50: " + insertionSort(returnVetor50.getVetorCriado()));
        System.out.println("Vetor tamanho 100: " + insertionSort(returnVetor100.getVetorCriado()));
        System.out.println("Vetor tamanho 1000: " + insertionSort(returnVetor1000.getVetorCriado()));
        System.out.println("Vetor tamanho 10000: " + insertionSort(returnVetor10000.getVetorCriado()));
    }


    static int bubbleSortOtimizado(int[] vetor) {
        boolean ordenado = false;
        int ultimoOrdenado = vetor.length - 1;
        int counter = 0;

        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < ultimoOrdenado; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    swap(vetor, i, i + 1);
                    ordenado = false;
                    counter++;
                }
            }
            ultimoOrdenado--;
        }

        return counter;
    }

    static int selectionSort(int arr[]) {
        int n = arr.length;
        int counter = 0;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            counter++;
        }
        return counter;
    }

    static int insertionSort(int[] vetor) {
        int batata = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j > 0; j--) {
                if (vetor[j] < vetor[j - 1]) {
                    swap(vetor, j, j - 1);
                    batata++;
                } else {
                    break;
                }
            }
        }

        return batata;
    }


    static void swap(int v[], int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

}

