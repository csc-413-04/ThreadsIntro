package threadsintro;

public class AbstractFactory {
  public static void main() {
    VehicleFactory factory;
    String type = "car";
    if(type.equals("car")){
      factory = new CarFactory();
    }else{
      factory = new TruckFactory();
    }
    IVehicle vehicle = factory.CreateVehicle();
    vehicle.honkHorn();
  }
}


interface IVehicle {
  public void honkHorn();
}

interface VehicleFactory {
  abstract IVehicle CreateVehicle();
}

class CarFactory implements VehicleFactory {
  public IVehicle CreateVehicle() {
    return new Car();
  }
}

class TruckFactory implements VehicleFactory {
  public IVehicle CreateVehicle() {
    return new Truck();
  }
}

class Car implements IVehicle {
  public void honkHorn() {
  }
}

class Truck implements IVehicle {
  public void honkHorn() {
  }
}

