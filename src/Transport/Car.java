package Transport;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Меняем покрышки - " + wheelsCount + " шт. и проверяем двигатель");
    }
}
