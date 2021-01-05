package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private double physAtt;
    private double magicAtt;

    public Shaman() {
        super(20, 20);
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt - (physAtt * (hero.getPhysDef() / 100));
        hero.setHealth(-damage);
    }

    @Override
    public void magicalAttack(Hero hero) {
        double damage = magicAtt - (magicAtt * (hero.getMagicDef() / 100));
        hero.setHealth(-damage);
    }

    @Override
    public void healHimself() {
        setHealth(50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(30);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                super.toString() +
                "physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
                '}';
    }
}
