
public class StorageDeviceFactory {
    public StorageDevice createStorageDevice(String type) {
        if (type.equalsIgnoreCase("ssd")) {
            return new SSD();
        } else if (type.equalsIgnoreCase("hdd")) {
            return new HDD();
        } else {
            throw new IllegalArgumentException("Invalid storage device type: " + type);
        }
    }
}
