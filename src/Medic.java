public class Medic extends Hero {
    private double healPoints;

    public Medic() {
        this.healPoints = 100;
    }

    public void increaseExperience() {
        this.healPoints *= 1.10;
        System.out.printf("Новое значение healPoints: %.2f%n", this.healPoints);
    }

    @Override
    public void applySuperAbility() {
        setTypeSuperAbility("Омоложение");
        System.out.println("Medic применил суперспособность " + this.getTypeSuperAbility());
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }
}