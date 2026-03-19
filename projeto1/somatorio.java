public class somatorio {
    public static int calcular(int[] lista) {
        int soma = 0;

        for (int num : lista) {
            soma += num;
        }

        return soma;
    }
}