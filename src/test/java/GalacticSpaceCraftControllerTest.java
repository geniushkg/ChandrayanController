import org.incubyte.Chandrayaan;
import org.incubyte.Direction;
import org.incubyte.GalacticSpaceCraftController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GalacticSpaceCraftControllerTest {

    @Test
    public void testExecuteCommands(){
        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] forwardCommand = {'f'};
        chandrayanController.executeCommands(forwardCommand);
        assertEquals(1, spacecraft.getX());

        char[] backwardCommand = {'b'};
        chandrayanController.executeCommands(backwardCommand);
        assertEquals(0,spacecraft.getX());
    }
}
