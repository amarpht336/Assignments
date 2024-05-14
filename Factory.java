
public class Factory {
    public static void main(String[] args) {
        StorageDeviceFactory deviceFactory = new StorageDeviceFactory();

        StorageDevice ssd = deviceFactory.createStorageDevice("ssd");
        StorageDevice hdd = deviceFactory.createStorageDevice("hdd");

        ssd.readData();
        ssd.writeData();

        hdd.readData();
        hdd.writeData();
    }
}
