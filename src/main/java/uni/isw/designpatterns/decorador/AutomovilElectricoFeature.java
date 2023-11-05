package uni.isw.designpatterns.decorador;

public class AutomovilElectricoFeature extends AutomovilDecorador{

    public AutomovilElectricoFeature(Automovil auto) {
        super(auto);
    }    
    
    @Override
    public void start() {
        System.out.println("Iniciando electronico");
        getAuto().start();
    }

    @Override
    public void accel() {
        System.out.println("controlando frenos electricos");
        getAuto().accel();
    }

    @Override
    public void stop() {
        System.out.println("deteniendo sistema operativo electricos");
        getAuto().stop();
    }
    
}
