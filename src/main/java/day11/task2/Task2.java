package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println("Paladin health= " + paladin.getHealth());
        paladin.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());
        shaman.healTeammate(magician);
        System.out.println("Magician health= " + magician.getHealth());
        magician.magicalAttack(paladin);
        System.out.println("Paladin health= " + paladin.getHealth());
        shaman.physicalAttack(warrior);
        System.out.println("Warrior health= " + warrior.getHealth());
        paladin.healHimself();
        System.out.println("Paladin health= " + paladin.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());
        warrior.physicalAttack(magician);
        System.out.println("Magician health= " + magician.getHealth());


    }
}
