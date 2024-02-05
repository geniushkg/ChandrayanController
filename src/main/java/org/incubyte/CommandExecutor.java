package org.incubyte;

public class CommandExecutor {
    public static void execute(Chandrayaan spacecraft, char command){
        switch (command){
            case 'f' :
                spacecraft.moveForward();
                break;
            case 'b' :
                spacecraft.moveBackward();
                break;
            case  'l':
                spacecraft.turnLeft();
                break;
            case 'r':
                spacecraft.turnRight();
                break;

            case 'u':
                spacecraft.turnUp();
                break;
            default:
                break;

        }
    }
}
