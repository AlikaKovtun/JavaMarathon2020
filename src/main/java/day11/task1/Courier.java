package day11.task1;

public class Courier implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    //ЗП изначально равна 0, и бонус по умолчанию не выплачен
    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.plusOneDelivOrder();


    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = true;
            } else System.out.println("Бонус пока не доступен");
        } else System.out.println("Бонус уже был выплачен");
    }
}
