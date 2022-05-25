package examen;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
public class Randomi implements Observable{
    private int even;
    private int odd;
    private int prime;
    private int ten;
    private int twentyfive;
    private List<Observer> lo;
    private HashMap<Integer,Integer> h;
    private HashMap<String,Observer> h1;
    private Randomi r;
    private Random rand;
    Randomi(){
        h=new HashMap<>();
        h1=new HashMap<>();
       lo= new ArrayList<>();
       rand= new Random();
    }

    public Randomi getInstance(){
        if(r==null){
            r= new Randomi();
        }
        return r;
    }
    
    @Override
    public void addObserver(String s,Observer o) {
        lo.add(o);
        h1.put(s,o);
        
    }

    @Override
    public void removeObserver(String s,Observer o) {
        lo.remove(o);
        h1.remove(s,o);
    }

    @Override
    public void notifyObs() {
        for(Observer o: lo){
            o.update();
        }
        
    }
    
    public int isPrime(int n){
        if(n==1) return 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void generateRandom(){

        while(true){
        int ran = rand.nextInt(101);
        while(h.containsKey(ran)){
            ran = rand.nextInt(101);
        }
        h.put(ran,1);
        if(ran%2==0){
            even+=1;
        }
        if(ran%2==1){
            odd+=1;
        }
        if(ran%10==0){
            ten+=1;
        }
        if(ran%25==0){
            twentyfive+=1;
        }
        if(isPrime(ran)==1){
            prime+=1;
        }

        if(even>=5 || odd>=5 || prime>=1 || ten>=3 || twentyfive>=2){
        notifyObs();
        return;
    }
        
        
    }
}
    
}
