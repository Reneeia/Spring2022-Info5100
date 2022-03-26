package neu.jia.info5100MidTerm.question03;

public abstract class Moody {
    abstract String getMood();
    abstract void expressFeelings();

    public void queryMood(){
        System.out.println("I feel " + this.getMood()+ " today!");
    }
}

