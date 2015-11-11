package com.camp.block;

import java.util.List;
import java.util.Random;

import com.camp.tileentity.TileEntityEndBlock;
import com.example.examplemod.cm;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EndBlock extends BlockContainer
{
    private static final String __OBFID = "CL_00000236";
    
    public static final String name = "EndBlock";

    
    
    	protected EndBlock(Material materialIn)
        {
            super(materialIn);
            this.setLightLevel(1.0F);
            this.setCreativeTab(cm.tabIke);
        }

        /**
         * Returns a new instance of a block's tile entity class. Called on placing the block.
         */
        public TileEntity createNewTileEntity(World worldIn, int meta)
        {
            return new TileEntityEndBlock();
        }

        @SideOnly(Side.CLIENT)
        public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
        {
            return side == EnumFacing.DOWN ? super.shouldSideBeRendered(worldIn, pos, side) : false;
        }

        /**
         * Add all collision boxes of this Block to the list that intersect with the given mask.
         *  
         * @param collidingEntity the Entity colliding with this Block
         */
    //    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List list, Entity collidingEntity) {}

        public boolean isOpaqueCube()
        {
            return false;
        }

        public boolean isFullCube()
        {
            return false;
        }

       

        

        @SideOnly(Side.CLIENT)
        public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
        {
            double d0 = (double)((float)pos.getX() + rand.nextFloat());
            double d1 = (double)((float)pos.getY() + 0.8F);
            double d2 = (double)((float)pos.getZ() + rand.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, d3, d4, d5, new int[0]);
        }

        

        /**
         * Get the MapColor for this Block and the given BlockState
         */
        public MapColor getMapColor(IBlockState state)
        {
            return MapColor.obsidianColor;
        }
}