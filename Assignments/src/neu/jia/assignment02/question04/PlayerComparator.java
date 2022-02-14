package neu.jia.assignment02.question04;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if (player1.getScore() == player2.getScore()) {
            return player1.getName().compareTo(player2.getName());
        }
        return player2.getScore() - player1.getScore();
    }
}
