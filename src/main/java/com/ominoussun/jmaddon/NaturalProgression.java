package com.ominoussun.jmaddon;

import journeymap.client.mod.IModBlockHandler;
import journeymap.client.model.BlockFlag;
import journeymap.client.model.BlockMD;

public class NaturalProgression implements IModBlockHandler
{
    public NaturalProgression() {}
    
    @Override
    public void initialize(BlockMD blockMD)
    {
        String name = blockMD.getBlockId().toLowerCase();
        if(name.contains("pebble") || name.contains("twig"))
        {
            blockMD.addFlags(BlockFlag.Ignore, BlockFlag.NoShadow, BlockFlag.NoTopo);
        }
    }
}
