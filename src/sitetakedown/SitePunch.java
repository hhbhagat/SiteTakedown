package sitetakedown;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SitePunch extends Thread{

    private volatile boolean running = true;
    private String site = "";
    
    @Override
    public void run(){
        while(running){
            try{
            Document doc = Jsoup.connect(site).get();
            }
            catch(Exception e){
            System.out.println("Can't get site");}

        }
    }
    
    public void setSite(String s){
        site = s;
    }
    
    public void shutdown(){
        running = false;
    }
    
}
