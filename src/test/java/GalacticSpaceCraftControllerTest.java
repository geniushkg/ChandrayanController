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
    }

    @Test
    public void testForward(){
        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] forwardCommand = {'f'};
        chandrayanController.executeCommands(forwardCommand);
        assertEquals(1, spacecraft.getX());
    }

    @Test
    public void testBackword(){

        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] backwardCommand = {'b'};
        chandrayanController.executeCommands(backwardCommand);
        assertEquals(-1,spacecraft.getX());
    }

    @Test
    public void testLeftTurn(){
        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] turnLeftCommand ={'l'};
        chandrayanController.executeCommands(turnLeftCommand);
        assertEquals(Direction.N,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnLeftCommand);
        assertEquals(Direction.W,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnLeftCommand);
        assertEquals(Direction.S,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnLeftCommand);
        assertEquals(Direction.E,spacecraft.getFacingDirection());
    }

    @Test
    public void testRightTurn(){
        Chandrayaan spacecraft = new Chandrayaan(0,0,0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] turnRightCommand ={'r'};
        chandrayanController.executeCommands(turnRightCommand);
        assertEquals(Direction.S,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnRightCommand);
        assertEquals(Direction.W,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnRightCommand);
        assertEquals(Direction.N,spacecraft.getFacingDirection());

        chandrayanController.executeCommands(turnRightCommand);
        assertEquals(Direction.E,spacecraft.getFacingDirection());
    }

    @Test
    public void testTurnUp() {
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] turnUpCommand = {'u'};
        chandrayanController.executeCommands(turnUpCommand);
        assertEquals(Direction.Up, spacecraft.getFacingDirection());
    }

    @Test
    public void testTurnDown(){
        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, Direction.E);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] turnUpCommand = {'d'};
        chandrayanController.executeCommands(turnUpCommand);
        assertEquals(Direction.Down, spacecraft.getFacingDirection());
    }

    @Test
    public void testFlow(){

        Chandrayaan spacecraft = new Chandrayaan(0, 0, 0, Direction.N);
        GalacticSpaceCraftController chandrayanController = new GalacticSpaceCraftController(spacecraft);

        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        chandrayanController.executeCommands(commands);

        assertEquals(0, spacecraft.getX());
        assertEquals(1, spacecraft.getY());
        assertEquals(-1, spacecraft.getZ());
        assertEquals(Direction.N, spacecraft.getFacingDirection());
    }



}
