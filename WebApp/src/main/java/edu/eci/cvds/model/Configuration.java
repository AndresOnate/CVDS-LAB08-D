package edu.eci.cvds.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Configuration {

    public Configuration(){}

    public Configuration(String property, String value){
        this.property = property;
        this.value = value;
    }

    
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long configurationId;
    @Id
    private String property;
    private String value;


    public String getConfigurationId(){
        return this.property;
    }

    public String getProperty(){
        return this.property;
    }

    public String getValue(){
        return this.value;
    }
/**
    public void setConfigurationId(Long id){
        this.configurationId = id;
    }
**/
    public void setProperty(String name){
        this.property = name;
    }

    public void setValor(String value){
        this.value = value;

    }

    @Override
    public String toString() {
        return "Configuration [property=" + property + ", value=" + value + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((property == null) ? 0 : property.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Configuration other = (Configuration) obj;
        if (property == null) {
            if (other.property != null)
                return false;
        } else if (!property.equals(other.property))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
    
}
