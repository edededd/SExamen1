package examen;
import java.util.logging.Logger;
public class App {
    static Logger logger= Logger.getLogger(App.class.getName());
    public static void main(String[] args){
       
        Randomi r =new Randomi();
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        User u4 = new User();
        User u5 = new User();
        r.addObserver("Cinco números pares", u1);
        r.addObserver("Cinco números impares",u2);
        r.addObserver("Un número primo",u3);
        r.addObserver("Tres números múltiplos de 10",u4);
        r.addObserver("Dos números múltiplos de 25",u5);
        
        r.generateRandom();
        

        
    }
}
