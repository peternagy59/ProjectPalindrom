package sk.kosickaakademia.sk.peter.vetvenie.Cycles;

public class Palindrom {
    public static void main(String[] args) {

        public class Palindrom {

            public static void main(String[] args) {
                System.out.print("Zadaj čislo: ");
                Scanner sc = new Scanner(System.in);

                long x = sc.nextLong();
                long x2 = x;
                long y = 0;

                while (x2 > 0) {
                    y = y + (x2 % 10);
                    y = y * 10;
                    x2 = (x2 / 10);
                }
                y = y / 10;
                if(x==y){
                    System.out.println("Toto cislo je palindrom");
                }
                else{
                    System.out.println("Toto cislo neni palindrom");
                }
            }
        }
    }
}
