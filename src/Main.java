public class Main {
    public static void main(String[] args) {
        byte a = 12;
        System.out.println(a);
        short b = 135;
        System.out.println(b);
        int c = 1489321;
        System.out.println(c);
        long d = 19999374832894L;
        System.out.println(d);
        float e = 1.4f;
        System.out.println(e);
        double f = 18.987633372819d;
        System.out.println(f);
        char ch = 0;
        System.out.println(ch);
        int age = 17;
        boolean  isAdult = age >= 18;
        System.out.println(isAdult);


        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float z = boxer1Weight + boxer2Weight;
        System.out.println("общий вес боксеров " + z + " кг");

        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int breakfast = (banan * 5) + (milk * 2) + (iceCream * 2) + (egg + 4);
        System.out.println("общий вес завтрака " + breakfast * 0.001 + " кг");

        int result = 7;
        float weightLossMin = 0.25f;
        float weightLossMax = 0.5f;
        float weightLossMean = (weightLossMin + weightLossMax) / 2;
        float daysMax = result / weightLossMin;
        float daysMin = result / weightLossMax;
        float daysMean = result / weightLossMean;
        System.out.println("Если спортсмен будет терять 0.25 кг в день, то потребуется " + daysMax + " дней");
        System.out.println("Если спортсмен будет терять 0.5 кг в день, то потребуется " + daysMin + " дней");
        System.out.println("Если спортсмен будет терять 0.375 кг в день, то потребуется " + daysMean + " дней");


    }
}