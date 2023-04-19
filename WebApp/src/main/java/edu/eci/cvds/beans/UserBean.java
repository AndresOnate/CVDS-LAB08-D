package edu.eci.cvds.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@ApplicationScoped
public class UserBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
