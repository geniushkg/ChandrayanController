package org.incubyte;

public class CommandExecutor {
    public static void execute(Chandrayaan spacecraft, char command){
        switch (command){
            case 'f' :
                spacecraft.moveForward();
                break;


        }
    }
}
