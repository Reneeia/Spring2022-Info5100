package neu.jia.info5100MidTerm.question03;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psyc = new Psychiatrist();
        // happy one
        Moody happy = new Happy();
        psyc.examine(happy);
        psyc.observe(happy);
        System.out.println(psyc);

        // sad one
        Moody sad = new Sad();
        psyc.examine(sad);
        psyc.observe(sad);
        System.out.println(psyc);
    }
}
