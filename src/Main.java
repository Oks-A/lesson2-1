public class Main {
    public static void main(String[] args) {

        int startBalance = 100; // Начальный счёт
        int amount = 1100; // Сумма пополнения
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int balance = startBalance + amount + bonus;
        System.out.println("Ваш баланс:" + balance + "руб. Бонус:" + bonus + "руб.");


    }
}