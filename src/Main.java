import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Pokemon pokemon1 = createPokemon(scanner, random);
        Pokemon pokemon2 = createPokemon(scanner, random);

        Battle battle = new Battle(pokemon1, pokemon2);
        battle.startBattle();

        scanner.close();
    }

    private static Pokemon createPokemon(Scanner scanner, Random random) {
        System.out.print("Enter Pokemon name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pokemon HP: ");
        int hp = Integer.parseInt(scanner.nextLine());

        Pokemon pokemon;
        if (random.nextDouble() < 0.1) {
            pokemon = new LegendaryPokemon(name, hp);
            System.out.println(name + " is a Legendary Pokemon!");
        } else {
            pokemon = new Pokemon(name, hp);
        }

        String moveName;
        int movePower, moveSpeed;
        while (true) {
            System.out.print("Enter move name (or 'q' to finish): ");
            moveName = scanner.nextLine();
            if (moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.print("Enter move power: ");
            movePower = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter move speed: ");
            moveSpeed = Integer.parseInt(scanner.nextLine());

            Move move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);
        }

        return pokemon;
    }
}
