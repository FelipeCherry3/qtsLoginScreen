import java.util.HashMap;
import java.util.Map;
/**
Classe que realiza um serviço de autenticação simples de Login e Senha

 **/
public class LoginScreen {
    Map<String,String> userDatabase;

    /**
     * Construtor Inicializa e Adiciona Valores em Nosso HashMap
     */
    public LoginScreen() {
        userDatabase = new HashMap<String,String>();
        userDatabase.put("felipe","senha123");
        userDatabase.put("jose","senha");
        userDatabase.put("caio","senha123");
    }

    /**
     *
     * @param login Input login
     * @param senha Input senha
     * @return {@code true} autenticação foi um sucesso, {@code false} autenticação falhou
     */
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
