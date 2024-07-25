public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[] {
                new Magic(),
                new Medic(),
                new Warrior()
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic medic) {
                medic.increaseExperience();
            }
        }
    }
}
