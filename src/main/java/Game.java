public class Game {

    Player player1;
    Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public void getWinner() {
        int scoreOne = player1.getHand().get(0).getValueFromEnum();
        int scoreTwo = player2.getHand().get(0).getValueFromEnum();
        System.out.println("ScoreOne " + scoreOne);
        System.out.println("ScoreTwo " + scoreTwo);
        if (scoreOne > scoreTwo){
            System.out.println("The winner is Player 1");
        } else {
            System.out.println("The winner is Player 2");
        }
    }
}
