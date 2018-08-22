public class Main {

    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "DELL", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "ACER", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherBoard);
        thePC.powerUp();
    }
}
