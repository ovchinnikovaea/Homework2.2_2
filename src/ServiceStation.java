import Transport.Bicycle;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class ServiceStation {
    public void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.modelName + " :");
            transport.check();
        }
    }