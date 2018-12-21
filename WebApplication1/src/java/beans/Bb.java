/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

//import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author miyazaki
 */
@Named
@RequestScoped
public class Bb {
    @NotNull
    private Integer number;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public EmployeeDb getDb() {
        return db;
    }

    public void setDb(EmployeeDb db) {
        this.db = db;
    }

    @Size(max=20, min=1)
    private String name;
    @Size(max=30, min=1)
    private String mail;
    
    @EJB
    EmployeeDb db;
    @Inject
    //transient Logger log;
    public String next(){
        System.out.println("bb.next()");
        create();
        return null;
    }
   
    public void create(){
        Employee emp = new Employee(number, name, mail);
        try{
            db.create(emp);
            clear();
        } catch(Exception e){
            System.out.println("can not regist new object/"+number);
            // log.server("can not regist new object/"+number);
        }
    }
    
    public void clear(){
        number = null;
        name = mail = null;
    }
}
