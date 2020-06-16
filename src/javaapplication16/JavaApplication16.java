/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jsoup.HttpStatusException;

import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author User
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
         List<StrefyCzasowe> StrefyCzasoweList = new ArrayList<>();
         Scanner sc = new Scanner(System.in);
         int i =0;
        
      try{  Document doc =Jsoup.connect("http://worldtimeapi.org/timezones").get();
        
        Elements liElements = doc.select("li");
        
        for(Element element: liElements){
    String url = doc.select("a").attr("href");
    String title = doc.select("a").text();
    
    StrefyCzasoweList.add(new StrefyCzasowe(url, title)); 
    }
        System.out.println("Wszystkie dostepne strefy czasowe: ");
        StrefyCzasoweList.forEach(System.out::println);
        
        System.out.println("Podaj wybrana strefe czasowa");
        String strefa = sc.nextLine();
        
        for(StrefyCzasowe x : StrefyCzasoweList)
        {
            i++;
         
        if(x.contains(strefa) = false || strefa = null){
            StrefyCzasoweList.forEach(System.out::println);
        }else if(x.contains(strefa) = true) {
        System.out.println(x.get(i).url + "W ponizszym linku znajdzie sie cala informacja odnosnie wybranej strefy czasowej");
        }
        }
        
        
     
        
      } catch(HttpStatusException ex){
      ex.printStackTrace(System.out);
      }
        
    }
    
}
