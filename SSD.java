
public class SSD implements StorageDevice {

    @Override
    public void readData() {
        System.out.println("Reading data from SSD");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to SSD");
    }

}
