package com.celestek.hexcraft.init;

import codechicken.microblock.BlockMicroMaterial;
import codechicken.microblock.MicroMaterialRegistry;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 */

public class HexMultipart {

    /**
     * Registers all Microblocks.
     */
    public static void initializeMicroblocks() {
        MicroMaterialRegistry.registerMaterial(new BlockMicroMaterial(HexBlocks.blockHexoriumCoatedStone, 0), BlockMicroMaterial.materialKey(HexBlocks.blockHexoriumCoatedStone));
    }
}
