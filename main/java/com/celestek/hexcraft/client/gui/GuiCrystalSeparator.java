package com.celestek.hexcraft.client.gui;

import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.container.ContainerCrystalSeparator;
import com.celestek.hexcraft.tileentity.TileCrystalSeparator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 * @version 0.8.0
 */

@SideOnly(Side.CLIENT)
public class GuiCrystalSeparator extends GuiContainer {

    // GUI Sizes
    private static final int GUI_SIZE_X = 176;
    private static final int GUI_SIZE_Y = 166;

    // GUI Strings
    private static final String GUI_STRING_INVENTORY = "container.inventory";
    private static final String GUI_STRING_IN = "hexcraft.container.in";

    private TileCrystalSeparator tileCrystalSeparator;

    /**
     * Constructor for GuiMatrixReconstructor.
     */
    public GuiCrystalSeparator(InventoryPlayer invPlayer, TileCrystalSeparator tileCrystalSeparator) {
        super(new ContainerCrystalSeparator(invPlayer, tileCrystalSeparator));

        // Save the Tile Entity.
        this.tileCrystalSeparator = tileCrystalSeparator;
    }

    /**
     * Draws strings of the GUI.
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2){

        // Check if the input energy of machine is between 0 and energyPerTick (non-inclusive). If yes, draw the input string in red.
        if (tileCrystalSeparator.getGuiEnergyDrained() > 0 && tileCrystalSeparator.getGuiEnergyDrained() < tileCrystalSeparator.getEnergyPerTick()) {
            String out = tileCrystalSeparator.getGuiEnergyDrained() + " HEX/t";
            fontRendererObj.drawString(out, 142 - fontRendererObj.getStringWidth(out) / 2, GUI_SIZE_Y - 94, 0xFF0000);
        }
        // Otherwise, check if the input energy of machine is equal to -1. If yes, draw the input string in red and make it always show 0.
        else if (tileCrystalSeparator.getGuiEnergyDrained() == -1) {
            String out = "0 HEX/t";
            fontRendererObj.drawString(out, 142 - fontRendererObj.getStringWidth(out) / 2, GUI_SIZE_Y - 94, 0xFF0000);
        }
        // Otherwise, check if the input energy of machine is equal to energyPerTick. If yes, draw the input string in green.
        else if (tileCrystalSeparator.getGuiEnergyDrained() == tileCrystalSeparator.getEnergyPerTick()) {
            String out = tileCrystalSeparator.getGuiEnergyDrained() + " HEX/t";
            fontRendererObj.drawString(out, 142 - fontRendererObj.getStringWidth(out) / 2, GUI_SIZE_Y - 94, 0x00FF00);
        }
        // In all other situations, draw the string normally.
        else {
            String out = tileCrystalSeparator.getGuiEnergyDrained() + " HEX/t";
            fontRendererObj.drawString(out, 142 - fontRendererObj.getStringWidth(out) / 2, GUI_SIZE_Y - 94, 0x404040);
        }

        // Draw the name string.
        String name = I18n.format(tileCrystalSeparator.getInventoryName());
        fontRendererObj.drawString(name, GUI_SIZE_X / 2 - fontRendererObj.getStringWidth(name) / 2, 6, 0x404040);
        // Draw the player container string.
        fontRendererObj.drawString(I18n.format(GUI_STRING_INVENTORY), 8, GUI_SIZE_Y - 94, 0x404040);
        // Draw the info box string.
        fontRendererObj.drawString(I18n.format(GUI_STRING_IN) + ":", 111 - fontRendererObj.getStringWidth(I18n.format(GUI_STRING_IN) + ":"), GUI_SIZE_Y - 94, 0x404040);
    }

    /**
     * Draws textures of the GUI.
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        // Bind the texture of the GUI.
        mc.getTextureManager().bindTexture(new ResourceLocation(HexCraft.MODID, "textures/gui/guiCrystalSeparator.png"));
        // Prepare x and y values (top left corner).
        int x = (width - GUI_SIZE_X) / 2;
        int y = (height - GUI_SIZE_Y) / 2;

        // Draw the background of GUI.
        drawTexturedModalRect(x, y, 0, 0, GUI_SIZE_X, GUI_SIZE_Y);

        // Draw the progress bar.
        int i = tileCrystalSeparator.getEnergyScaled(35);
        drawTexturedModalRect(x + 70, y + 32, 176, 0, i + 1, 22);
    }
}
