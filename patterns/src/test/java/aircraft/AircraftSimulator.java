package aircraft;

import org.junit.Test;
import strategy.Aircraft;
import strategy.Cessna;
import strategy.FlyRocketPowered;
import strategy.ModelAircraft;

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
