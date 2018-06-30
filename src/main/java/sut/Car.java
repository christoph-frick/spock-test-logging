package sut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

    private Logger logger = LoggerFactory.getLogger(Car.class);

    void startCar() {
        logger.error("car stopped working");
    }

}
