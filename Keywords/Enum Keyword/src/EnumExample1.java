public class EnumExample1 {
    public enum Season {WINTER, SPRING, SUMMER, FALL}

    public enum Days {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int value;
        private Days(int value) {
            this.value = value;
        }
        public static Days getEnum(int i){
            return Days.values()[i];
        }
    }

//    public enum Season {
//          WINTER,
//          SPRING,
//          SUMMER,
//          FALL;
//    }

        public static void main(String[] args) {
            //Printing All Enums with values() function
            System.out.println("All Values of Season :- " + Season.values());

            //valueOf() and ordinal() methods
            System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
            System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
            System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());

            Season s = Season.WINTER;
            System.out.println(s);

            for (Days d : Days.values())
                System.out.println(d+" "+d.value);

            Days d1 = Days.MONDAY;
            Days d2 = Days.getEnum(1);
            System.out.println(Days.getEnum(2).equals(d1)); // False
            System.out.println(d2.equals(d1)); // True
        }
    }