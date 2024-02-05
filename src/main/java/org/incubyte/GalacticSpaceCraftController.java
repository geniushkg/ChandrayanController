package org.incubyte;

public class GalacticSpaceCraftController {
    private Chandrayaan spacecraftChandrayaan;

    public GalacticSpaceCraftController(Chandrayaan spacecraftChandrayaan){
        this.spacecraftChandrayaan = spacecraftChandrayaan;
    }

    public void executeCommands(char[] commands){
        for(char eachCommand: commands){
            CommandExecutor.execute(spacecraftChandrayaan,eachCommand);
        }
    }
}
