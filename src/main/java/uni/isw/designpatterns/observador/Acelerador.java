package uni.isw.designpatterns.observador;
import java.util.ArrayList;
public class Acelerador implements SujetoObservable{
    private ArrayList<Observador> observadores;
    
    public Acelerador() {
        observadores=new ArrayList<Observador>();
    }
    //registramos los observadores
    public void enlazarObservador(Observador o){
        observadores.add(o);
    }
    //detectamos cambios y notificamos
    public void pisarElAlecerador(){
        //se dispara el evento notificar
        notificar();
    }
    @Override
    public void notificar() {
        for(Observador o: observadores )
            o.update();
    }
    
}
