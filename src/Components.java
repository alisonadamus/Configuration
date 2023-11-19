public abstract class Components {

    private String name;
    private int price;

    public Components(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class CPU extends Components implements AddToMatherboard {

    public CPU(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToMatherboard() {

    }
}

class RAM extends Components implements AddToMatherboard {

    public RAM(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToMatherboard() {

    }
}

class Motherboard extends Components {

    public Motherboard(String name, int price) {
        super(name, price);
    }
}

class HDD extends Components implements AddToCase {

    public HDD(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToCase() {

    }
}

class PowerSupply extends Components implements AddToCase {

    public PowerSupply(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToCase() {

    }
}

class ComputerCase extends Components{

    public ComputerCase(String name, int price) {
        super(name, price);
    }
}

class VideoCard extends Components implements AddToMatherboard{

    public VideoCard(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToMatherboard() {

    }
}

class SoundCard extends Components implements AddToMatherboard {

    public SoundCard(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToMatherboard() {

    }
}

class NetworkAdapter extends Components implements AddToMatherboard{

    public NetworkAdapter(String name, int price) {
        super(name, price);
    }

    @Override
    public void addToMatherboard() {

    }
}

