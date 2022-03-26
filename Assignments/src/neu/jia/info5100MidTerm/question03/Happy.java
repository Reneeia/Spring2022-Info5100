package neu.jia.info5100MidTerm.question03;


public class Happy extends Moody{
    @Override
    String getMood() {
        return "happy";
    }

    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
