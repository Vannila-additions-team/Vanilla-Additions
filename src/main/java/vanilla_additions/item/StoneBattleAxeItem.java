
package vanilla_additions.item;

import vanilla_additions.VanillaAdditionsModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.block.Blocks;

@VanillaAdditionsModElements.ModElement.Tag
public class StoneBattleAxeItem extends VanillaAdditionsModElements.ModElement {
	@ObjectHolder("vanilla_additions:stone_battle_axe")
	public static final Item block = null;
	public StoneBattleAxeItem(VanillaAdditionsModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 131;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE, (int) (1)), new ItemStack(Blocks.STONE, (int) (1)));
			}
		}, 1, -3.6f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("stone_battle_axe"));
	}
}
