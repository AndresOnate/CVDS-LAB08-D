package edu.eci.cvds.beans;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import edu.eci.cvds.model.Configuration;
import edu.eci.cvds.service.ConfigurationService;

@Component
@ManagedBean(name = "guessBean")
@SessionScoped

public class BackingBean {

    @Autowired
    ConfigurationService configurationService;

    private int number;
    private int reward;
    private int originalReward;
    private int tries;
    private String state;
    private ArrayList<Integer> alreadyTried;


    
    public BackingBean(){
    }

    public void guess(int attempt){
        addTry();
        alreadyTried.add(attempt);
        if (attempt == number){
            setState("Win: " + String.valueOf(reward));
        }else{
            setReward(reward - 10);
            setState("You still do not win");
        }
    }

    public void reset(){
        int randomNumber = (int)(Math.random()*10 + 1);
        alreadyTried = new ArrayList<>();
        setTries(0);
        setNumber(randomNumber);
        setState("You still do not win");
        setReward(originalReward);
    }

    @Bean
    public CommandLineRunner getValueDB() {
        return args -> {
            Configuration propiedad = configurationService.getConfiguration("PREMIO");
            String valueS = propiedad.getValue();
            int value = Integer.parseInt(valueS);
            setOriginalReward(value);
            reset();
        };
        
    }

    public int getNumber(){
        return number;
    }

    public int getOriginalReward() {
        return originalReward;
    }

    public void setOriginalReward(int originalReward) {
        this.originalReward = originalReward;
    }

    public int getReward(){
        return reward;
    }

    public int getTries(){
        return tries;
    }

    public String getState(){
        return state;
    }

    public void setNumber(int number){
        this.number =  number;

    }

    public void setTries(int tries){
        this.tries = tries;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setReward(int reward){
        this.reward = reward;
    } 

    public void addTry(){
        int newTry = getTries() + 1;
        setTries(newTry);
    }

    public ArrayList<Integer> getAlreadyTried(){
        return alreadyTried;
    }

}
