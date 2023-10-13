package Transport;

public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Меняем покрышки - " + wheelsCount + " шт., проверяем двигатель и прицеп");
    }
}
