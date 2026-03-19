import java.util.*;

public class fibonacci {
    public static List<Integer> gerar(int n) {
        List<Integer> seq = new ArrayList<>();
        seq.add(0);
        seq.add(1);

        for (int i = 2; i < n; i++) {
            seq.add(seq.get(i - 1) + seq.get(i - 2));
        }

        return seq;
    }
}