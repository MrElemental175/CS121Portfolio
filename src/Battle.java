import java.util.Random;
public class Battle {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Random random;

    public Battle(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.random = new Random();
    }

    public void startBattle() {
        System.out.println("Battle Start!");
        System.out.println(pokemon1.getName() + " vs " + pokemon2.getName());

        while (pokemon1.getHp() > 0 && pokemon2.getHp() > 0) {
            int moveIndex1 = random.nextInt(pokemon1.getMoveArrayList().size());
            int moveIndex2 = random.nextInt(pokemon2.getMoveArrayList().size());

            Move move1 = pokemon1.getMoveArrayList().get(moveIndex1);
            Move move2 = pokemon2.getMoveArrayList().get(moveIndex2);

            System.out.println(pokemon1.getName() + " uses " + move1.getMoveName());
            System.out.println(pokemon2.getName() + " uses " + move2.getMoveName());

            if (move1.getMoveSpeed() >= move2.getMoveSpeed()) {
                pokemon2.takeDamage(move1.getMovePower());
                pokemon1.takeDamage(move2.getMovePower());
            } else {
                pokemon1.takeDamage(move2.getMovePower());
                pokemon2.takeDamage(move1.getMovePower());
            }

            System.out.println(pokemon1);
            System.out.println(pokemon2);
        }

        if (pokemon1.getHp() > 0) {
            System.out.println(pokemon1.getName() + " wins!");
        } else if (pokemon2.getHp() > 0) {
            System.out.println(pokemon2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
