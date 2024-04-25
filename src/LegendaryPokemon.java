
public class LegendaryPokemon extends Pokemon {
    private static final double DamageReduction = 0.2;

    public LegendaryPokemon(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = (int) (damage * (1 - DamageReduction));
        super.takeDamage(reducedDamage);
    }
}


