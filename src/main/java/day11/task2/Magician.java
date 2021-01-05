package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private double physAtt;
    private double magicAtt;

    public Magician() {
        super(0, 80);
        physAtt = 5;
        magicAtt = 20;
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
    public String toString() {
        return
                "Magician{" +
                        super.toString() +
                        "physAtt=" + physAtt +
                        ", magicAtt=" + magicAtt +
                        '}';
    }
}
