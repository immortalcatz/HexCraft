package com.celestek.hexcraft.init;

import com.celestek.hexcraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 */

public class HexItems {

    // Raw Materials
    public static Item itemHexoriumCrystalRed;
    public static Item itemHexoriumCrystalGreen;
    public static Item itemHexoriumCrystalBlue;
    public static Item itemHexoriumCrystalWhite;
    public static Item itemHexoriumCrystalBlack;

    // Components T1
    public static Item itemRainbowEnergizedGlobule;
    public static Item itemWhiteHexoriumWafer;
    public static Item itemBlackHexoriumWafer;
    public static Item itemSpatialProjector;
    public static Item itemOreActuator;
    public static Item itemPylonSocket;
    public static Item itemHexoriumGlassPackage;

    // Components T2
    public static Item itemRainbowCore;
    public static Item itemHexoriumProcessor;
    public static Item itemHexoriumCoprocessor;
    public static Item itemMineralAnalyzer;
    public static Item itemHexoriumEnergyConverter;
    public static Item itemEnergyInjector;
    public static Item itemMolecularRecoder;
    public static Item itemHexoriumRFAdapter;

    // Components MP
    public static Item itemMachineControlPanel;
    public static Item itemMachineEnergyRouter;
    public static Item itemHeatDissipator;
    public static Item itemHeatingArray;
    public static Item itemCrystalExtractionUnit;
    public static Item itemMatrixAdjuster;
    public static Item itemMaterialInteractionPlane;
    public static Item itemTeleportationFieldProjector;
    public static Item itemDigitalSmartpipe;
    
    // Tools
    public static Item itemHexoriumManipulator;
    public static Item itemHexoriumProbe;
    public static Item itemMolecularTransposer;
    public static Item itemHexoriumReinforcer;

    /**
     * Initializes all items and adds them to GameRegistry.
     */
    public static void initializeItems() {
        // Raw Materials
        itemHexoriumCrystalRed = new HexItemComponent("itemHexoriumCrystalRed");
        GameRegistry.registerItem(itemHexoriumCrystalRed, "itemHexoriumCrystalRed");
        itemHexoriumCrystalGreen = new HexItemComponent("itemHexoriumCrystalGreen");
        GameRegistry.registerItem(itemHexoriumCrystalGreen, "itemHexoriumCrystalGreen");
        itemHexoriumCrystalBlue = new HexItemComponent("itemHexoriumCrystalBlue");
        GameRegistry.registerItem(itemHexoriumCrystalBlue, "itemHexoriumCrystalBlue");
        itemHexoriumCrystalWhite = new HexItemComponent("itemHexoriumCrystalWhite");
        GameRegistry.registerItem(itemHexoriumCrystalWhite, "itemHexoriumCrystalWhite");
        itemHexoriumCrystalBlack = new HexItemComponent("itemHexoriumCrystalBlack");
        GameRegistry.registerItem(itemHexoriumCrystalBlack, "itemHexoriumCrystalBlack");

        // Components T1
        itemRainbowEnergizedGlobule = new HexItemComponent("itemRainbowEnergizedGlobule");
        GameRegistry.registerItem(itemRainbowEnergizedGlobule, "itemRainbowEnergizedGlobule");
        itemWhiteHexoriumWafer = new HexItemComponent("itemWhiteHexoriumWafer");
        GameRegistry.registerItem(itemWhiteHexoriumWafer, "itemWhiteHexoriumWafer");
        itemBlackHexoriumWafer = new HexItemComponent("itemBlackHexoriumWafer");
        GameRegistry.registerItem(itemBlackHexoriumWafer, "itemBlackHexoriumWafer");
        itemSpatialProjector = new HexItemComponent("itemSpatialProjector");
        GameRegistry.registerItem(itemSpatialProjector, "itemSpatialProjector");
        itemOreActuator = new HexItemComponent("itemOreActuator");
        GameRegistry.registerItem(itemOreActuator, "itemOreActuator");
        itemPylonSocket = new HexItemComponent("itemPylonSocket");
        GameRegistry.registerItem(itemPylonSocket, "itemPylonSocket");
        itemHexoriumGlassPackage = new HexItemComponent("itemHexoriumGlassPackage");
        GameRegistry.registerItem(itemHexoriumGlassPackage, "itemHexoriumGlassPackage");

        // Components T2
        itemRainbowCore = new HexItemComponent("itemRainbowCore");
        GameRegistry.registerItem(itemRainbowCore, "itemRainbowCore");
        itemHexoriumCoprocessor = new HexItemComponent("itemHexoriumCoprocessor");
        GameRegistry.registerItem(itemHexoriumCoprocessor, "itemHexoriumCoprocessor");
        itemHexoriumProcessor = new HexItemComponent("itemHexoriumProcessor");
        GameRegistry.registerItem(itemHexoriumProcessor, "itemHexoriumProcessor");
        itemMineralAnalyzer = new HexItemComponent("itemMineralAnalyzer");
        GameRegistry.registerItem(itemMineralAnalyzer, "itemMineralAnalyzer");
        itemHexoriumEnergyConverter = new HexItemComponent("itemHexoriumEnergyConverter");
        GameRegistry.registerItem(itemHexoriumEnergyConverter, "itemHexoriumEnergyConverter");
        itemEnergyInjector = new HexItemComponent("itemEnergyInjector");
        GameRegistry.registerItem(itemEnergyInjector, "itemEnergyInjector");
        if (HexConfig.cfgTeleportEnable) {
            itemMolecularRecoder = new HexItemComponent("itemMolecularRecoder");
            GameRegistry.registerItem(itemMolecularRecoder, "itemMolecularRecoder");
        }
        if (HexConfig.cfgEnergyNodeEnable) {
            itemHexoriumRFAdapter = new HexItemComponent("itemHexoriumRFAdapter");
            GameRegistry.registerItem(itemHexoriumRFAdapter, "itemHexoriumRFAdapter");
        }

        // Components MP
        itemMachineControlPanel = new HexItemComponent("itemMachineControlPanel");
        GameRegistry.registerItem(itemMachineControlPanel, "itemMachineControlPanel");
        itemMachineEnergyRouter = new HexItemComponent("itemMachineEnergyRouter");
        GameRegistry.registerItem(itemMachineEnergyRouter, "itemMachineEnergyRouter");
        itemHeatDissipator = new HexItemComponent("itemHeatDissipator");
        GameRegistry.registerItem(itemHeatDissipator, "itemHeatDissipator");
        itemHeatingArray = new HexItemComponent("itemHeatingArray");
        GameRegistry.registerItem(itemHeatingArray, "itemHeatingArray");
        itemCrystalExtractionUnit = new HexItemComponent("itemCrystalExtractionUnit");
        GameRegistry.registerItem(itemCrystalExtractionUnit, "itemCrystalExtractionUnit");
        itemMatrixAdjuster = new HexItemComponent("itemMatrixAdjuster");
        GameRegistry.registerItem(itemMatrixAdjuster, "itemMatrixAdjuster");
        if (HexConfig.cfgTeleportEnable) {
            itemMaterialInteractionPlane = new HexItemComponent("itemMaterialInteractionPlane");
            GameRegistry.registerItem(itemMaterialInteractionPlane, "itemMaterialInteractionPlane");
            itemTeleportationFieldProjector = new HexItemComponent("itemTeleportationFieldProjector");
            GameRegistry.registerItem(itemTeleportationFieldProjector, "itemTeleportationFieldProjector");
        }
        if (HexConfig.cfgTankEnable) {
            itemDigitalSmartpipe = new HexItemComponent("itemDigitalSmartpipe");
            GameRegistry.registerItem(itemDigitalSmartpipe, "itemDigitalSmartpipe");
        }
        
        // Tools
        itemHexoriumManipulator = new ItemHexoriumManipulator(ItemHexoriumManipulator.ID);
        GameRegistry.registerItem(itemHexoriumManipulator, ItemHexoriumManipulator.ID);
        itemHexoriumProbe = new ItemHexoriumProbe(ItemHexoriumProbe.ID);
        GameRegistry.registerItem(itemHexoriumProbe, ItemHexoriumProbe.ID);
        itemMolecularTransposer = new ItemMolecularTransposer(ItemMolecularTransposer.ID);
        GameRegistry.registerItem(itemMolecularTransposer, ItemMolecularTransposer.ID);
        itemHexoriumReinforcer = new ItemHexoriumReinforcer(ItemHexoriumReinforcer.ID);
        GameRegistry.registerItem(itemHexoriumReinforcer, ItemHexoriumReinforcer.ID);
    }
}
