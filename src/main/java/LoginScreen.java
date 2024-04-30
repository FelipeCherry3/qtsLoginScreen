import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
    HashMap<String,String> userDatabase = new HashMap<String,String>();

    public LoginScreen() {
        userDatabase.put("felipe","senha123");
        userDatabase.put("jose","senha");
        userDatabase.put("caio","senha123");
    }

    public boolean login(String login, String senha) {
        for(Map.Entry<String,String> entry : userDatabase.entrySet()){
            String loginHash = entry.getKey();
            String senhaHash = entry.getValue();
            if(loginHash.equals(login) && senhaHash.equals(senha)){
                return true;
            }
        }
        return false;
    }


}
