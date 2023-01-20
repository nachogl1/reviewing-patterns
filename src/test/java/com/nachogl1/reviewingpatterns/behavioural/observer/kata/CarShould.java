package com.nachogl1.reviewingpatterns.behavioural.observer.kata;

import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable.MainCarFactoryManufacturer;
import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.*;
import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.display.Display;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CarShould {

    @Test
    void receiveUpdateWhenNotified() {
        MainCarFactoryManufacturer factory = new MainCarFactoryManufacturer();
        String testVersion = "V10.0.1";
        Display displayMock = mock(Display.class);
        Car car1 = new CoolCar(factory, displayMock);
        Car car2 = new NiceCar(factory, displayMock);
        Car car3 = new SuperbCar(factory, displayMock);

        factory.updateAll(testVersion);

        verify(displayMock,times(1)).display("Car CoolCar received new update V10.0.1");
        verify(displayMock,times(1)).display("Car NiceCar received new update V10.0.1");
        verify(displayMock,times(1)).display("Car SuperbCar received new update V10.0.1");
    }
}
