public class quicksort {

    public static void ordenar(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(arr, inicio, fim);
            ordenar(arr, inicio, p - 1);
            ordenar(arr, p + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivot = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return i + 1;
    }
}