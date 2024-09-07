package tfar.fullblockchest;

import net.minecraftforge.fml.common.Mod;

@Mod(FullBlockChest.MOD_ID)
public class FullBlockChestForge {
    
    public FullBlockChestForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        FullBlockChest.init();
        
    }
}