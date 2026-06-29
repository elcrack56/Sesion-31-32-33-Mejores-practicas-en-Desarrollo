package isp;

interface Switchable {
    void turnOn();
    void turnOff();
}

interface Chargeable {
    void charge();
}

class Phone implements Switchable, Chargeable {
    @Override
    public void turnOn() { System.out.println("Phone is turning ON."); }

    @Override
    public void turnOff() { System.out.println("Phone is turning OFF."); }

    @Override
    public void charge() { System.out.println("Phone is charging..."); }
}

class DisposableCamera implements Switchable {
    @Override
    public void turnOn() { System.out.println("Camera is turning ON."); }

    @Override
    public void turnOff() { System.out.println("Camera is turning OFF."); }

}

public class DeviceSystem {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Dispositivos (Aplicando ISP) ---\n");

        Phone myPhone = new Phone();
        DisposableCamera myCam = new DisposableCamera();

        System.out.println("Operando el Teléfono:");
        myPhone.turnOn();
        myPhone.charge();
        myPhone.turnOff();

        System.out.println("\nOperando la Cámara Desechable:");
        myCam.turnOn();
        myCam.turnOff();
        System.out.println("Nota: El sistema no permite cargar la cámara porque no es recargable.");
    }
}