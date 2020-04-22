package com.turtysproductions.humlands.common.blocks;

import java.util.Random;

import com.turtysproductions.humlands.core.init.ParticleInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RubberStreamingRubberWoodLog extends LogBlock {

	public RubberStreamingRubberWoodLog(MaterialColor verticalColorIn, Properties properties) {
		super(verticalColorIn, properties);
	}

	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		if (worldIn.isRemote) {
		}
	}
}
