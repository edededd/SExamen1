package examen;
import java.util.logging.Logger;
public class User implements Observer{
    Logger logger= Logger.getLogger(User.class.getName());
    @Override
    public void update() {
        logger.info("Se acabo el juego");
        
    }
    
}
