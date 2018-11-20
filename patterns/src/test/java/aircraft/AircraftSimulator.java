package aircraft;

import org.junit.Test;

/**
 * Test Class AircraftSimulator.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public class AircraftSimulator {

    @Test
    public void testFight() {
        Aircraft cessna = new Cessna();
        cessna.performShoot();
        cessna.performFly();

        Aircraft model = new ModelAircraft();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
