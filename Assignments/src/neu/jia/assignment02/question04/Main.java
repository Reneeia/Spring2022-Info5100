package neu.jia.assignment02.question04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Ada",100);
        Player player2 = new Player("Beta",100);
        Player player3 = new Player("Cider",90);
        Player player4 = new Player("Dan",105);

        List<Player> list = Arrays.asList(player1,player2,player3,player4);

        System.out.println(list.toString());
        list.sort(new PlayerComparator());
        System.out.println(list.toString());
    }
}
