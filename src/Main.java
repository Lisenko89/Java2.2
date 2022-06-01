public class Main {
    public static void main(String[] args) {
        int account = 0;
        int add = 1200;
        int bonus;

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        ;
        int itog = account + add + bonus;

        System.out.println("У Вас на счете: " + itog + "руб.");
        System.out.println("В том числе бонусов: " + bonus + "руб.");

    }
}
