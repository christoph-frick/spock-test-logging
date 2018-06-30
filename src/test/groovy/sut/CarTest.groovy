package sut

import org.slf4j.Logger
import spock.lang.Specification

class CarTest extends Specification {
    def "mock log"() {
        given:
        def car = new Car()
        car.logger = Mock(Logger)
        when:
        car.startCar()
        then:
        1 * car.logger.error('car stopped working')
    }
}
