
public class HDD implements StorageDevice {

    @Override
    public void readData() {
        System.out.println("Reading data from HDD");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to HDD");
    }

}
