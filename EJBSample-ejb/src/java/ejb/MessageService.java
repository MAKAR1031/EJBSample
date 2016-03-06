package ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(MessageServiceLocal.class)
public class MessageService implements MessageServiceLocal {

    @Override
    public String getMessage(String name) {
        return "Hello, " + name + "!";
    }
}
