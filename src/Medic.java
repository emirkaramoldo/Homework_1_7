public class Medic extends Hero{

    private int healPoints;

    // Конструктор
    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    // Геттер для healPoints
    public int getHealPoints() {
        return healPoints;
    }

    // Сеттер для healPoints
    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    // Метод для увеличения опыта лечения
    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.10); // Увеличиваем healPoints на 10%
        System.out.println("Medic увеличил очки лечения до " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        setTypeSuperAbility("Омоложение");
        System.out.println("Medic применил суперспособность " + this.getTypeSuperAbility());
    }
}