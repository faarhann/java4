public class PC {
    private Case theCase;
    private Monitor monitors;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitors, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitors.drawPixelAt(1200, 50, "green");
    }


}
