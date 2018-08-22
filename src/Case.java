public class Case {
    private String model;
    private String manifaturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manifaturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manifaturer = manifaturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManifaturer() {
        return manifaturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
