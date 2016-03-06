package beans;

import ejb.MessageServiceLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MessageBean{
    @EJB
    private MessageServiceLocal messageService;
    private String message;
    private String name;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void hello() {
        message = messageService.getMessage(name);
    }
    
    @PostConstruct
    private void onCreate() {
        name = "no name";
    }
}