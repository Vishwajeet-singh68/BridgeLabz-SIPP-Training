import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service is running"); }
}

class Client {
    @Inject
    Service service;
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : client.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, field.getType().getDeclaredConstructor().newInstance());
            }
        }
        client.service.serve();
    }
}