package day11.task2;

public abstract class Hero {

    private double health;
    private double physDef;
    private double magicDef;

    public Hero(double physDef, double magicDef) {
        this.health = 100;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if ((this.health + health) <= 100 && (this.health + health) >= 0) {
            this.health += health;
        } else if ((this.health + health) > 100) {
            this.health = 100;
        } else
            this.health = 0;


    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public String toString() {
        return
                "health=" + health +
                        ", physDef=" + physDef +
                        ", magicDef=" + magicDef +
                        '}';
    }
}
