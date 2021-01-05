package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private double physAtt;

    public Warrior() {
        super(80, 0);
        physAtt = 30;
    }


    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt - (physAtt * (hero.getPhysDef() / 100));
        hero.setHealth(-damage);

    }

    @Override
    public String toString() {
        return
                "Warrior{" +
                        super.toString() +
                        "physAtt=" + physAtt +
                        '}';
    }
}
