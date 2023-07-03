package EnumHelper;

public enum DrinksMachine {
    COFFEE{
        @Override
        public void make() {
            System.out.println("Ви замовили каву");
        }
    },
    TEA{
        public void make() {
            System.out.println("Ви замовили чай");
        }
    },
    LEMONADE{
        public void make() {
            System.out.println("Ви замовили лемонад");
        }
    },
    MOJITO{
        public void make() {
            System.out.println("Ви замовили мохіто");
        }
    },
    MINERAL_WATER{
        public void make() {
            System.out.println("Ви замовили мінеральну воду");
        }
    },
    COCA_COLA{
        public void make() {
            System.out.println("Ви замовили кока-колу");
        }
    };

    public abstract void make();
}
