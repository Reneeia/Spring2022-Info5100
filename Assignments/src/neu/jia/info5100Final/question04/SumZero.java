package neu.jia.info5100Final.question04;

public class SumZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        for (int i = 0; i < n / 2; i++) {
            result[i] = i + 1;
            result[n / 2 + i] = -(i + 1);
        }
        return result;
    }
}
