package day11.task1;

public class Picker implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    //ЗП изначально равна 0, и бонус по умолчанию не выплачен
    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.plusOnePickedOrder();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = true;
            }
            else System.out.println("Бонус пока не доступен");
        }
        else System.out.println("Бонус уже был выплачен");
    }
}
