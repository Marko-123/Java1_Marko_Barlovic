package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {
        
        Television tv = new Television(3, 33, true);
        tv.showData();
        
        tv.setVolume(2);
        tv.setCurrentProgram(22);
        tv.setTurnOn(false);
        tv.showData();
        
        Radio IN = new Radio(99.2, 102, 'F');
        IN.showData();

    }

}
