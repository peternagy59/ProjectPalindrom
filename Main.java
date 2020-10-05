package sk.kosickaakademia.sk.peter.vetvenie.Cycles;

public class Main {
    public static void main(String[] args) {
        int cislo=100;
        int prve=0;
        int druhe=0;
        int tretie=0;
        int sucet=0;
        while (cislo<=999){
            prve=cislo/100;
            druhe=(cislo/10)%10;
            tretie=cislo%10;
            if (prve!=druhe && druhe!=tretie && tretie!=prve){
                sucet=sucet+cislo;
                System.out.print(cislo+" ");
                cislo++;
            }
            else {
                cislo++;
            }
        }
        System.out.println(sucet);
    }
}

