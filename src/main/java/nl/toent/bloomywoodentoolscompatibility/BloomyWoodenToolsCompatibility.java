package nl.toent.bloomywoodentoolscompatibility;

import net.fabricmc.api.ModInitializer;

import nl.toent.bloomywoodentoolscompatibility.items.initializeCustomItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BloomyWoodenToolsCompatibility implements ModInitializer {
	public static final String MOD_ID = "bloomywoodentoolscompatibility";


	@Override
	public void onInitialize() {
		initializeCustomItems.register();
	}
}