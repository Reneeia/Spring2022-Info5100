package neu.jia.info5100MidTerm.question03;

public class Psychiatrist {
    private String observationRes = "N/A";

    public void examine(Moody moody) {
        System.out.println("How are you feeling today?");
        moody.queryMood();
    }

    public void observe(Moody moody) {
        moody.expressFeelings();
        observationRes = moody.toString();
    }

    public String toString() {
        return "Observation: " + observationRes;
    }
}

