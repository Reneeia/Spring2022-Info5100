package neu.jia.info5100MidTerm.question03;

public class Sad extends Moody {
    @Override
    String getMood() {
        return "sad";
    }

    @Override
    void expressFeelings() {
        System.out.println("'waah''boo hoo''weep''sob'");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
