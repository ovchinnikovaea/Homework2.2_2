package Transport;

public abstract class Transport {

    public String modelName;

    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void check();
}
