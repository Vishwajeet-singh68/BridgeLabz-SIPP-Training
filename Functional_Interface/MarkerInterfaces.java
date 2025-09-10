
// Marker Interface Examples
interface Backupable {}
interface SensitiveData {}

class UserData implements Backupable, SensitiveData {
    String name;
    String password;
    UserData(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class MarkerInterfaces {
    public static void main(String[] args) {
        UserData user = new UserData("Alice", "secret123");
        if (user instanceof Backupable) {
            System.out.println("UserData marked for backup.");
        }
        if (user instanceof SensitiveData) {
            System.out.println("UserData marked as sensitive for encryption.");
        }
    }
}
