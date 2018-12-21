/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author miyazaki
 */
@Named
@RequestScoped
public class MeiboBean {
    private Integer number;
    private String name;

    public void toConsole(){
        System.out.println("number="+this.number+"/ name="+this.name);
    }
    
    public void next(){
        this.toConsole();
        return "output.xhtml";
    }
    
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
