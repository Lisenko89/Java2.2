public class Main {
    public static void main(String[] args) {
        int schet = 0;
        int popolnenie = 1200;
        int bonus;

        if (popolnenie > 1000) {bonus = popolnenie/100;} else {bonus = 0;};
        int itog = schet + popolnenie + bonus;

        System.out.println("У Вас на счете: " + itog+"руб.");
        System.out.println("В том числе бонусов: " + bonus +"руб.");

    }
}
