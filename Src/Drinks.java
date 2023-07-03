import EnumHelper.DrinksMachine;

import java.util.Scanner;

public class Drinks {
    public static final double PRICE_COFFEE = 30.00;
    public static final double PRICE_TEA = 20.00;
    public static final double PRICE_LEMONADE = 40.00;
    public static final double PRICE_MOJITO = 50.00;
    public static final double PRICE_MINERAL_WATER = 10.00;
    public static final double PRICE_COCA_COLA = 20.00;


    public static double price = 0;
    public static int amount = 0;

    DrinksMachine[] drinks = DrinksMachine.values();

    public int[] count = new int[drinks.length];

    public Drinks() {


        System.out.println("Зробіть своє замовлення:\n1 - кава;\n2 - чай;\n3 - лемонад\n4 - мохіто\n5 - мінеральна вода\n" +
                "6 - кока-кола\n0 - завершити вибір");
        try (Scanner scn = new Scanner(System.in)) {


            for (int i = 0; ; i++) {
                int num = scn.nextInt();
                switch (num) {
                    case 1:
                        drinks[0].make();
                        this.count[0]++;
                        amount++;
                        System.out.println(this.count[0] + " шт.");
                        break;
                    case 2:
                        drinks[1].make();
                        this.count[1]++;
                        amount++;
                        System.out.println(this.count[1] + " шт.");
                        break;
                    case 3:
                        drinks[2].make();
                        this.count[2]++;
                        amount++;
                        System.out.println(this.count[2] + " шт.");
                        break;
                    case 4:
                        drinks[3].make();
                        this.count[3]++;
                        amount++;
                        System.out.println(this.count[3] + " шт.");
                        break;
                    case 5:
                        drinks[4].make();
                        this.count[4]++;
                        amount++;
                        System.out.println(this.count[4] + " шт.");
                        break;
                    case 6:
                        drinks[5].make();
                        this.count[5]++;
                        amount++;
                        System.out.println(this.count[5] + " шт.");
                        break;
                    case 0:
                        System.out.println("Вибір зроблено.");
                        break;
                }

                if (num == 0) break;
                if (num > 6) System.out.println("Невірний вибір");

            }
        } catch (Exception e) {
            System.out.println("Невірний вибір");
        }


        System.out.println("Ваше замовлення:");
        for (int i = 0; i < drinks.length; i++) {
            if (this.count[i] == 0) {
            } else {
                System.out.println(drinks[i] + " " + this.count[i] + " шт");
            }
        }


        price = this.count[0] * PRICE_COFFEE + this.count[1] * PRICE_TEA + this.count[2] * PRICE_LEMONADE +
                this.count[3] * PRICE_MOJITO + this.count[4] * PRICE_MINERAL_WATER + this.count[5] * PRICE_COCA_COLA;

        System.out.println("Загальна кількість напоїв складає " + amount + " шт");
        System.out.println("Загальна вартість складає: " + price + " грн");


    }
}
