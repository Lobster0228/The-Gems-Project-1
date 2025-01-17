package com.foozey.gems.world.ore;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class DeepslateFossil extends DropExperienceBlock {

    // Properties (material, hardness, sound, tool)
    public DeepslateFossil() {
        super(Properties
                .of(Material.STONE)
                .strength(4.5f, 4.5f)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops());
    }

    // XP drop
    @Override
    public int getExpDrop(BlockState state, LevelReader reader, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? Mth.nextInt(RandomSource.create(), 0, 0) : 0;
    }

}