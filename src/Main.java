public class Main {
    public static void main(String[] args) {

        int initially = 100;
        int replenishment = 400;
        int bet = 100;
        int bonus = 1;

        if (replenishment > 1000) {
            System.out.println((initially / bet * bonus) + " бонус(ов)");
        } else {
            System.out.println((initially + replenishment) + " бонус(ов)");
        }
    }

}