
package media;

public class Radio {
    
    
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public double getfmFrequency() {
        return fmFrequency;
    }

    public void setfmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public int getamFrequency() {
        return amFrequency;
    }

    public void setamFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }
    
    public char getband() {
        return band;
    }

    public void setband(char band) {
        this.band = band;
    }
    
    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
        
    }
    
    public void showData() {
        System.out.println("fmFrequency is: " + getfmFrequency());
        System.out.println("amFrequency is:" + getamFrequency());
        System.out.println("band is: " + getband());
        System.out.println("");
    }
}
