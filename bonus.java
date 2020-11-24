public class Main {
    public static void main (String[] args) {
        int valueInKpoecks = 100000;
        int paymentInKopecks = 180000;
        int bonusInKopecks;
        if (paymentInKopecks > valueInKpoecks) {
            bonusInKopecks = paymentInKopecks / 10000;
        } else {
            bonusInKopecks = 0;
        }

        System.out.println(bonusInKopecks);

    }
}
