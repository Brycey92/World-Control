package worldcontrolteam.worldcontrol.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import worldcontrolteam.worldcontrol.WorldControl;
import worldcontrolteam.worldcontrol.tileentity.TileEntityHowlerAlarm;
import worldcontrolteam.worldcontrol.utils.GuiLib;


public class BlockHowlerAlarm extends BlockBasicRotate{

    public BlockHowlerAlarm() {
        super(Material.IRON);
        setHardness(0.5F);
        setRegistryName("HowlerAlarm");
        setUnlocalizedName("HowlerAlarm");
        setCreativeTab(WorldControl.TAB);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public TileEntity getTile(World world, int meta) {
        return new TileEntityHowlerAlarm();
    }

    @Override
    public boolean hasGUI() {
        return true;
    }

    @Override
    public int guiID() {
        return GuiLib.INDUSTRIAL_ALARM;
    }
}