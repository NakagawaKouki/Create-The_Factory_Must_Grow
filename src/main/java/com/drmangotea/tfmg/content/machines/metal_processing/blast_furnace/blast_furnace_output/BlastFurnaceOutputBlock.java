package com.drmangotea.tfmg.content.machines.metal_processing.blast_furnace.blast_furnace_output;

import com.drmangotea.tfmg.registry.TFMGBlockEntities;
import com.drmangotea.tfmg.registry.TFMGBlocks;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class BlastFurnaceOutputBlock extends HorizontalDirectionalBlock implements IBE<BlastFurnaceOutputBlockEntity> {
    public BlastFurnaceOutputBlock(Properties p_54120_) {
        super(p_54120_);
    }
    public BlockState getStateForPlacement(BlockPlaceContext p_48781_) {
        return this.defaultBlockState().setValue(FACING, p_48781_.getHorizontalDirection().getOpposite());
    }
    @Override
    public Class<BlastFurnaceOutputBlockEntity> getBlockEntityClass() {
        return BlastFurnaceOutputBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends BlastFurnaceOutputBlockEntity> getBlockEntityType() {
        return TFMGBlockEntities.BLAST_FURNACE_OUTPUT.get();
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder.add(FACING));
    }
}