import java.util.LinkedList;

public class APS {

    private static int counterQuick;

    //Bubble Sort *, Selection Sort *, Insertion Sort , Heap Sort, Merge Sort, Quick Sort, Count Sort, Bucket Sort e Radix Sort

    public static void main(String args[]) {
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

        System.out.println("---------------------------------------------------");

        //HeapSort
        System.out.println("Vetor tamanho 5: " + heapSort(returnVetor5.getVetorCriado()));
        System.out.println("Vetor tamanho 10: " + heapSort(returnVetor10.getVetorCriado()));
        System.out.println("Vetor tamanho 50: " + heapSort(returnVetor50.getVetorCriado()));
        System.out.println("Vetor tamanho 100: " + heapSort(returnVetor100.getVetorCriado()));
        System.out.println("Vetor tamanho 1000: " + heapSort(returnVetor1000.getVetorCriado()));
        System.out.println("Vetor tamanho 10000: " + heapSort(returnVetor10000.getVetorCriado()));

        System.out.println("---------------------------------------------------");

        //mergeSort
        System.out.println("Vetor tamanho 5: " + mergeSortIterativo(returnVetor5.getVetorCriado()));
        System.out.println("Vetor tamanho 10: " + mergeSortIterativo(returnVetor10.getVetorCriado()));
        System.out.println("Vetor tamanho 50: " + mergeSortIterativo(returnVetor50.getVetorCriado()));
        System.out.println("Vetor tamanho 100: " + mergeSortIterativo(returnVetor100.getVetorCriado()));
        System.out.println("Vetor tamanho 1000: " + mergeSortIterativo(returnVetor1000.getVetorCriado()));
        System.out.println("Vetor tamanho 10000: " + mergeSortIterativo(returnVetor10000.getVetorCriado()));

        System.out.println("---------------------------------------------------");

        counterQuick = 0;

        //quickSort
        System.out.println("Vetor tamanho 5: " + quickSort(returnVetor5.getVetorCriado(), 0, returnVetor5.getLenght()));
        System.out.println("Vetor tamanho 10: " + quickSort(returnVetor10.getVetorCriado(), 0, returnVetor10.getLenght()));
        System.out.println("Vetor tamanho 50: " + quickSort(returnVetor50.getVetorCriado(), 0, returnVetor50.getLenght()));
        System.out.println("Vetor tamanho 100: " + quickSort(returnVetor100.getVetorCriado(), 0, returnVetor100.getLenght()));
        System.out.println("Vetor tamanho 1000: " + quickSort(returnVetor1000.getVetorCriado(), 0, returnVetor1000.getLenght()));
        System.out.println("Vetor tamanho 10000: " + quickSort(returnVetor10000.getVetorCriado(), 0, returnVetor10000.getLenght()));

        System.out.println("---------------------------------------------------");

        counterQuick = 0;

        //countSort
        System.out.println("Vetor tamanho 5: " + countSort(returnVetor5.getVetorCriado(), returnVetor5.getLenght()));
        System.out.println("Vetor tamanho 10: " + countSort(returnVetor10.getVetorCriado(), returnVetor10.getLenght()));
        System.out.println("Vetor tamanho 50: " + countSort(returnVetor50.getVetorCriado(), returnVetor50.getLenght()));
        System.out.println("Vetor tamanho 100: " + countSort(returnVetor100.getVetorCriado(), returnVetor100.getLenght()));
        System.out.println("Vetor tamanho 1000: " + countSort(returnVetor1000.getVetorCriado(), returnVetor1000.getLenght()));
        System.out.println("Vetor tamanho 10000: " + countSort(returnVetor10000.getVetorCriado(), returnVetor10000.getLenght()));

        System.out.println("---------------------------------------------------");

        //bucketSort
//        System.out.println("Vetor tamanho 5: " + bucketSort(returnVetor5.getVetorCriado()));
//        System.out.println("Vetor tamanho 10: " + bucketSort(returnVetor10.getVetorCriado()));
//        System.out.println("Vetor tamanho 50: " + bucketSort(returnVetor50.getVetorCriado()));
//        System.out.println("Vetor tamanho 100: " + bucketSort(returnVetor100.getVetorCriado()));
//        System.out.println("Vetor tamanho 1000: " + bucketSort(returnVetor1000.getVetorCriado()));
//        System.out.println("Vetor tamanho 10000: " + bucketSort(returnVetor10000.getVetorCriado()));

//        System.out.println("---------------------------------------------------");

        //radixSort
//        System.out.println("Vetor tamanho 5: " + radixSort(returnVetor5.getVetorCriado()));
//        System.out.println("Vetor tamanho 10: " + radixSort(returnVetor10.getVetorCriado()));
//        System.out.println("Vetor tamanho 50: " + radixSort(returnVetor50.getVetorCriado()));
//        System.out.println("Vetor tamanho 100: " + radixSort(returnVetor100.getVetorCriado()));
//        System.out.println("Vetor tamanho 1000: " + radixSort(returnVetor1000.getVetorCriado()));
//        System.out.println("Vetor tamanho 10000: " + radixSort(returnVetor10000.getVetorCriado()));

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

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            counter++;
        }
        return counter;
    }

    //p - índice inicial; r - índice final
    static int quickSort(int[] vetor, int p, int r) {
        if (p < r) {
            int q = partition(vetor, p, r);
            quickSort(vetor, p, q - 1);
            quickSort(vetor, q + 1, r);
        }
        return counterQuick;
    }

    static int partition(int[] vetor, int p, int r) {
        int q = p;
        for (int i = p; i < r; i++) {
            if (vetor[i] <= vetor[r]) {
                swap(vetor, q, i);
                counterQuick++;
                q++;
            }
        }
        swap(vetor, q, r);
        counterQuick++;
        return q;
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

    static int mergeSortIterativo(int[] vetor) {
        int p, r;
        int b = 1;

        while (b < vetor.length) {
            p = 0;
            while (p + b < vetor.length) {
                r = p + 2 * b;
                if (r > vetor.length) {
                    r = vetor.length;
                }
                merge(vetor, p, p + b - 1, r - 1);
                p = p + 2 * b;
            }
            b = b * 2;
        }
        return counterQuick;
    }

    static void merge(int[] vetor, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] aux1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            aux1[i] = vetor[i + p];
        }
        int[] aux2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            aux2[i] = vetor[i + q + 1];
        }
        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (i == n1) {
                vetor[k] = aux2[j++];
                counterQuick++;
            } else if (j == n2) {
                vetor[k] = aux1[i++];
                counterQuick++;
            } else if (aux1[i] < aux2[j]) {
                vetor[k] = aux1[i++];
                counterQuick++;
            } else {
                vetor[k] = aux2[j++];
                counterQuick++;
            }
        }
    }

    static int heapSort(int[] vetor) {
        int counter = 0;
        buildMaxHeap(vetor, vetor.length);
        int n = vetor.length;
        for (int i = n - 1; i >= 1; i--) {
            swap(vetor, 0, i);
            counter++;
            n--;
            maxHeapfy(vetor, n, 0);
        }
        return counter;
    }

    static void buildMaxHeap(int[] vetor, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapfy(vetor, n, i);
        }
    }

    static void maxHeapfy(int[] vetor, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maior;
        if (left < n && vetor[left] > vetor[i]) {
            maior = left;
        } else {
            maior = i;
        }
        if (right < n && vetor[right] > vetor[maior]) {
            maior = right;
        }
        if (maior != i) {
            swap(vetor, i, maior);
            maxHeapfy(vetor, n, maior);
        }
    }

    public static boolean isOrdenado(int[] vetor) {
        boolean ordenado = true;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                ordenado = false;
                break;
            }
        }
        return ordenado;
    }

//    public static int bucketSort(int[] vetor, int maiorValor) {
//        int numDivisao = 10;
//        int numBaldes = maiorValor / numDivisao;
//        int counter = 0;
//
//        LinkedList[] B = new LinkedList[numBaldes];
//
//        //Cria as listas nos baldes
//        for (int i = 0; i < numBaldes; i++) {
//            B[i] = new LinkedList<>();
//        }
//
//        //Coloca os valores no balde respectivo:
//        for (int i = 0; i < vetor.length; i++) {
//            int j = numBaldes - 1;
//            while (true) {
//                if (j < 0) {
//                    break;
//                }
//                if (vetor[i] >= (j * numDivisao)) {
//                    B[j].add(vetor[i]);
//                    break;
//                }
//                j--;
//            }
//        }
//
//        //Ordena e atualiza o vetor:
//        int indice = 0;
//        for (int i = 0; i < numBaldes; i++) {
//
//            int[] aux = new int[B[i].size()];
//
//            //Coloca cada balde num vetor:
//            for (int j = 0; j < aux.length; j++) {
//                aux[j] = (Integer) B[i].get(j);
//            }
//
//            counter += insertionSort(aux); //algoritmo escolhido para ordenação.
//
//            // Devolve os valores ao vetor de entrada:
//            for (int j = 0; j < aux.length; j++, indice++) {
//                vetor[indice] = aux[j];
//            }
//        }
//
//        return counter;
//    }

//    static void radixSort(int[] vetor, int largestNum) {
//        int i, significantDigit = 1;
//        int[] semiSorted = new int[vetor.length];
//        while (largestNum / significantDigit > 0) {
//            int[] bucket = new int[10];
//            for (i = 0; i < vetor.length; i++) {
//                bucket[(vetor[i] / significantDigit) % 10]++;
//            }
//            for (i = 1; i < 10; i++) {
//                bucket[i] += bucket[i - 1];
//            }
//            for (i = vetor.length - 1; i >= 0; i--) {
//                semiSorted[--bucket[(vetor[i] / significantDigit) % 10]] = vetor[i];
//            }
//            for (i = 0; i < vetor.length; i++) {
//                vetor[i] = semiSorted[i];
//            }
//            significantDigit *= 10;
//        }
//    }

    static int countSort(int[] vetor, int m) {
        int counter[] = new int[m + 1];
        int counterSort = 0;

        for (int i = 0; i < vetor.length; i++) {
            counter[vetor[i]]++;
        }
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                vetor[ndx++] = i;
                counter[i]--;
                counterSort++;
            }
        }

        return counterSort;
    }

    static void swap(int v[], int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    public int getCounterQuick() {
        return counterQuick;
    }

    public void setCounterQuick(int counterQuick) {
        this.counterQuick = counterQuick;
    }
}

