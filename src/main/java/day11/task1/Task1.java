package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        businessProcess(picker);
        businessProcess(courier);

        System.out.println("Информация по сборщику 1: ");
        info(picker, warehouse);
        System.out.println();
        System.out.println("Информация по курьеру 1: ");
        info(courier, warehouse);
        System.out.println();

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();

        System.out.println("Информация по сборщику 2: ");
        info(picker2, warehouse2);
        System.out.println();
        System.out.println("Информация по курьеру 2: ");
        info(courier2, warehouse2);
        System.out.println();

        System.out.println("Контроль информация по сборщику 1: ");
        info(picker, warehouse);
        System.out.println();
        System.out.println("Контроль информация по курьеру 1: ");
        info(courier, warehouse);
        System.out.println();


    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    static void info(Worker worker, Warehouse warehouse) {
        if (worker instanceof Picker) {
            System.out.println("Зарплата: " + ((Picker) worker).getSalary());
            System.out.println("Собрано заказов: " + warehouse.getCountPickedOrders());
        } else {
            System.out.println("Зарплата: " + ((Courier) worker).getSalary());
            System.out.println("Доставлено заказов: " + warehouse.getCountPickedOrders());
        }

    }

}
