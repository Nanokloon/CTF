package org.ctf.eu.Teams;


import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

public class BlueFlag {
    public static ItemStack makeBlueFlag(){
        ItemStack itemStack = new ItemStack(Material.BLUE_BANNER);
        BannerMeta bannerMeta = (BannerMeta) itemStack.getItemMeta();
        bannerMeta.addPattern(new Pattern(DyeColor.BLACK, PatternType.CIRCLE_MIDDLE));
        itemStack.setItemMeta(bannerMeta);
        return itemStack;
    }
}
