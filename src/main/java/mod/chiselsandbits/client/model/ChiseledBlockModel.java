package mod.chiselsandbits.client.model;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import mod.chiselsandbits.client.model.baked.DataAwareChiseledBlockBakedModel;
import mod.chiselsandbits.render.chiseledblock.ChiseledBlockSmartModel;
import net.minecraft.client.renderer.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModelConfiguration;
import net.minecraftforge.client.model.geometry.IModelGeometry;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;

public class ChiseledBlockModel implements IModelGeometry<ChiseledBlockModel>
{
    @Override
    public IBakedModel bake(
      final IModelConfiguration owner,
      final ModelBakery bakery,
      final Function<RenderMaterial, TextureAtlasSprite> spriteGetter,
      final IModelTransform modelTransform,
      final ItemOverrideList overrides,
      final ResourceLocation modelLocation)
    {
        return new DataAwareChiseledBlockBakedModel();
    }

    @Override
    public Collection<RenderMaterial> getTextures(
      final IModelConfiguration owner, final Function<ResourceLocation, IUnbakedModel> modelGetter, final Set<Pair<String, String>> missingTextureErrors)
    {
        //We are not injecting our own textures.
        //So this is irrelevant.
        return ImmutableSet.of();
    }
}
