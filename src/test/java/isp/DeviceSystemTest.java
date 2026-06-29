package isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeviceSystemTest {
    @Test
    void testPhoneFullFunctionality() {
        Phone phone = new Phone();
        assertDoesNotThrow(() -> {
            phone.turnOn();
            phone.charge();
            phone.turnOff();
        });
    }

    @Test
    void testDisposableCameraLimitedFunctionality() {
        DisposableCamera camera = new DisposableCamera();
        assertDoesNotThrow(() -> {
            camera.turnOn();
            camera.turnOff();
        });
    }
}