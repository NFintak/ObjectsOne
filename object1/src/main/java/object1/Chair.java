package object1;

public class Chair {
    private String material;
    private String color;
    private int legs = 0;
    private boolean hasArmrests = false;

    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.hasArmrests = hasArmrests;
    }

    public String getMaterial(String material) {
        return material;
    }

    public void setMaterial() {
        this.material = material;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getLegs(int legs) {
        return legs;
    }

    public void setLegs() {
        this.legs = legs;
    }

    public boolean gethasArmrests(boolean hasArmrests) {
        return hasArmrests;
    }

    public void setHasArmrests() {
        this.hasArmrests = hasArmrests;
    }
}