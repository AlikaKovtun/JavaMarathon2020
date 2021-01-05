package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    private double physAtt;

    public Paladin() {
        super(50, 20);
        physAtt = 15;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt - (physAtt * (hero.getPhysDef() / 100));
        hero.setHealth(-damage);
    }

    @Override
    public void healHimself() {
        setHealth(25);

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(10);

    }

    @Override
    public String toString() {
        return
                "Paladin{" +
                        super.toString() +
                        "physAtt=" + physAtt +
                        '}';
    }
}
