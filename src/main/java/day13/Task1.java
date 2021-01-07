package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Lando");
        User user2 = new User("Alex");
        User user3 = new User("George");

        user1.sendMessage(user2, "Привет, Алекс!");
        user1.sendMessage(user2, "Как твои дела?");
        user2.sendMessage(user1, "О, привет, Ландо!");
        user2.sendMessage(user1, "Все отлично");
        user2.sendMessage(user1, "Готовлюсь к гран при, а твои?");
        user3.sendMessage(user1, "Ландо, привет!");
        user3.sendMessage(user1, "Есть идея");
        user3.sendMessage(user1, "как насчет стрима?");
        user1.sendMessage(user3, "Привет, Джордж!");
        user1.sendMessage(user3, "Я за");
        user1.sendMessage(user3, "Сейчас напишу Алексу и Шарлю");
        user3.sendMessage(user1, "окей, через пол часа подключаемся");

        MessageDatabase.showDialog(user1, user3);




    }
}
