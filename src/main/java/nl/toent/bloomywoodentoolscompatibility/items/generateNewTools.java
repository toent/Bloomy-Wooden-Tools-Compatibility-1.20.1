package nl.toent.bloomywoodentoolscompatibility.items;

import net.minecraft.util.Identifier;
import nl.toent.bloomywoodentoolscompatibility.BloomyWoodenToolsCompatibility;

public enum generateNewTools {

    dead,
    empyreal,
    fir,
    hellbark,
    jacaranda,
    magic,
    mahogany,
    maple,
    palm,
    pine,
    redwood,
    umbran,
    willow;

    public Identifier getId(){
        return new Identifier(BloomyWoodenToolsCompatibility.MOD_ID, this.name());
    }

}
