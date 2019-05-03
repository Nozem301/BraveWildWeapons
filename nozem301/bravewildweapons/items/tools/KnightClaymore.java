package nozem301.bravewildweapons.items.tools;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.lwjgl.input.Keyboard;

import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import nozem301.bravewildweapons.Main;
import nozem301.bravewildweapons.items.ToolSword;

public class KnightClaymore extends ToolSword {

	public KnightClaymore(String name, ToolMaterial material) {
		super(name, material);
		setCreativeTab(Main.BWWTH_TAB);
	}
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("Only the most confident of Hyrule Castle's knights carried this two-handed sword.");
        }
        else
        {
            tooltip.add("Hold " + "\u00A7a" + "Shift" + "\u00A77" + " for more information"); //"\u00A7e" is a color code
        }
    }
    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);
 
        if (slot == EntityEquipmentSlot.MAINHAND) {
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, 1.25); // 4 0.625
        }
 
        return modifiers;
    }
 
    /**
     * Replace a modifier in the {@link Multimap} with a copy that's had
     * {@code multiplier} applied to its value.
     *
     * @param modifierMultimap
     *            The MultiMap
     * @param attribute
     *            The attribute being modified
     * @param id
     *            The ID of the modifier
     * @param multiplier
     *            The multiplier to apply
     */
    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id,
            double multiplier) {
        // Get the modifiers for the specified attribute
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());
 
        // Find the modifier with the specified ID, if any
        final Optional<AttributeModifier> modifierOptional = modifiers.stream()
                .filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();
 
        if (modifierOptional.isPresent()) { // If it exists,
            final AttributeModifier modifier = modifierOptional.get();
            modifiers.remove(modifier); // Remove it
            modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), modifier.getAmount() * multiplier,
                    modifier.getOperation())); // Add the new modifier
        }
    }

}
