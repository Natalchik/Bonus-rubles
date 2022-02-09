public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс счета

        int payment = 3000; // платеж

        int bonus;

        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + payment + bonus;

        System.out.println("Итоговый счет:" + finalBalance);
        System.out.println("Количество бонусных рублей:" + bonus);

    }
}

