package hello;

import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {
    
    private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminEmail;
    
    public String getAppName(){
        return appName;   
    }
    
    public String getAppDescription(){
        return appDescription;   
    }
    
    public String getAdminFirstName(){
        return adminFirstName;   
    }
    
    public String getAdminEmail(){
        return adminEmail;   
    }
    
    public void setAppName(String name){
        this.appName = name;   
    }
    
    public void setAppDescription(String description){
        this.appDescription = description;   
    }
    
        public void setAdminFirstName(String name){
        this.adminFirstName = name;   
    }
    
        public void setAdminEmail(String email){
        this.adminEmail = email;   
    }
    
    
    
    
}
