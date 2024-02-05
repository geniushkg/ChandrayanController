import org.incubyte.Chandrayaan;
import org.incubyte.Direction;
import org.incubyte.GalacticSpaceCraftController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GalacticSpaceCraftControllerTest {

    @Test
    public void testExecuteCommands(){
        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.N);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] commands = {'f','r','u','b','l'};
        chandrayanController.executeCommands(commands);
        assertEquals(0, spacecraft.getX());

    }
}
