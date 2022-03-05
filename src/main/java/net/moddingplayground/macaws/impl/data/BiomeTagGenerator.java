package net.moddingplayground.macaws.impl.data;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.Biome;
import net.moddingplayground.frame.api.toymaker.v0.generator.tag.AbstractTagGenerator;
import net.moddingplayground.macaws.api.tag.MacawsBiomeTags;

import static net.minecraft.world.biome.BiomeKeys.*;

public class BiomeTagGenerator extends AbstractTagGenerator<Biome> {
    public BiomeTagGenerator(String modId) {
        super(modId, BuiltinRegistries.BIOME);
    }

    @Override
    public void generate() {
        this.add(MacawsBiomeTags.SPAWNS_MACAW, JUNGLE, SPARSE_JUNGLE, BAMBOO_JUNGLE);
    }

    @Override
    public Identifier getId(Identifier id) {
        return new Identifier(id.getNamespace(), String.format("%s/%s", this.tagDir, id.getPath()));
    }
}
