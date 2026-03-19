public class contagem {
    public static int contar(int[] lista, int primeiro, int N) {
        int count = 0;

        for (int num : lista) {
            if (num >= primeiro && num <= N) {
                count++;
            }
        }

        return count;
    }
}