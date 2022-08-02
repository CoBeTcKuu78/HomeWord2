public class Main {
    public static void main(String[] args) {
        //задание 1
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

        //задание 2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float z = boxer1Weight + boxer2Weight;
        float zz = boxer2Weight - boxer1Weight;
        System.out.println("общий вес боксеров " + z + " кг");
        System.out.println("разница в весе боксеров " + zz + " кг");

        //задание 3
        int banan = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int breakfast = (banan * 5) + (milk * 2) + (iceCream * 2) + (egg + 4);
        System.out.println("общий вес завтрака " + breakfast * 0.001 + " кг");

        //задание 4
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

        //задание 5
        var masha = 67_760;
        var denis = 83_690;
        var kristina = 76_230;
        var mashaHight = masha + (masha * 0.1);
        var denisHight = denis + (denis * 0.1);
        var kristinaHight = kristina + (kristina * 0.1);
        var mashaDiff = mashaHight - masha;
        var denisDiff = denisHight - denis;
        var kristinaDiff = kristinaHight - kristina;
        System.out.println("После увеличения ЗП на 10%, Маша будет получать " + mashaHight + " рублей в месяц. Её ЗП увеличится на " + mashaDiff + " рублей в месяц.");
        System.out.println("После увеличения ЗП на 10%, Денис будет получать " + denisHight + " рублей в месяц. Её ЗП увеличится на " + denisDiff + " рублей в месяц.");
        System.out.println("После увеличения ЗП на 10%, Кристина будет получать " + kristinaHight + " рублей в месяц. Её ЗП увеличится на " + kristinaDiff + " рублей в месяц.");


    }
}