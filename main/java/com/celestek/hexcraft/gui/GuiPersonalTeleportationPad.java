package com.celestek.hexcraft.gui;

import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.inventory.ContainerPersonalTeleportationPad;
import com.celestek.hexcraft.tileentity.TileHexoriumFurnace;
import com.celestek.hexcraft.tileentity.TilePersonalTeleportationPad;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 * @version 0.6.2

 */

@SideOnly(Side.CLIENT)
public class GuiPersonalTeleportationPad extends GuiContainer {

    // Prepare a TilePersonalTeleportationPad object.
    private TilePersonalTeleportationPad tileEntity;

    /**
     * Constructor for GuiPersonalTeleportationPad.
     */
    public GuiPersonalTeleportationPad(InventoryPlayer invPlayer, TilePersonalTeleportationPad tileEntity) {
        super(new ContainerPersonalTeleportationPad(invPlayer, tileEntity));

        // Save the Tile Entity.
        this.tileEntity = tileEntity;
    }

    /**
     * Draws strings of the GUI.
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2){
        // Get the name string.
        String name = tileEntity.hasCustomInventoryName() ? tileEntity.getInventoryName() : I18n.format(tileEntity.getInventoryName());

        // Draw the input string.
        String out = tileEntity.energyInGui + " HEX/t";
        fontRendererObj.drawString(out, 142 - fontRendererObj.getStringWidth(out) / 2, 205 - 94, 0x404040);

        // Draw the name string.
        fontRendererObj.drawString(name, xSize / 2 - fontRendererObj.getStringWidth(name) / 2, 45, 0x404040);

        // Draw the charge string.
        String charge =  "Charge: " + tileEntity.getEnergyScaled(100) + "%";
        fontRendererObj.drawString(charge, 24, 90, 0x404040);

        // Draw the number strings.
        fontRendererObj.drawString("1", 91 - fontRendererObj.getStringWidth("1"), 68, 0x404040);
        fontRendererObj.drawString("2", 155 - fontRendererObj.getStringWidth("2"), 68, 0x404040);

        // Draw the info box string.
        fontRendererObj.drawString("In:", 111 - fontRendererObj.getStringWidth("In:"), 205 - 94, 0x404040);
    }

    /**
     * Draws textures of the GUI.
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        // Bind the texture of the GUI.
        mc.getTextureManager().bindTexture(new ResourceLocation(HexCraft.MODID, "textures/gui/guiPersonalTeleportationPad.png"));
        // Prepare x and y values (top left corner).
        int x = (width - 176) / 2;
        int y = (height - 88) / 2;

        // Draw the background of GUI.
        drawTexturedModalRect(x, y, 0, 0, 176, 88);

        // Draw the progress bar.
        int i = tileEntity.getEnergyScaled(64);
        // If the bar exceeds total length, trim it.
        if (i > 128)
            i = 128;
        drawTexturedModalRect(x + 23, y + 37, 0, 88, i + 1, 12);
    }
}