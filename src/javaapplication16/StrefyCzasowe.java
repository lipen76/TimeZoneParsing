/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author User
 */
class StrefyCzasowe {
    private String url;
    private String name;
    
    public StrefyCzasowe(String url, String name){
    this.name = name;
    this.url = url;
    }

    
    public String getUrl(){
    return url;
    }
    public void SetUrl(String url){
    this.url=url;
    }
    
    public String getName(){
    return name;
    }
    public void SetName(String name){
    this.name=name;
    }
    
   public String toString(){
    return "StrefyCzasowe{" +
            "url='" + url + '\'' +
            ", name'" + name + '\'' +
            '}';
    }
}
    

