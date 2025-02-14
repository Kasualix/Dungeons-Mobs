package com.infamous.dungeons_mobs.worldgen;

import com.infamous.dungeons_mobs.config.DungeonsMobsConfig;
import com.infamous.dungeons_mobs.mod.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.world.raid.Raid;
import net.minecraftforge.fml.ModList;

public class RaidEntries {

    public static void initWaveMemberEntries(){
        /*
      VINDICATOR(EntityType.VINDICATOR, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      EVOKER(EntityType.EVOKER, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      PILLAGER(EntityType.PILLAGER, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      WITCH(EntityType.WITCH, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      RAVAGER(EntityType.RAVAGER, new int[]{0, 0, 0, 1, 0, 1, 0, 2});
         */

        // WARRIOR
        if(DungeonsMobsConfig.COMMON.ENABLE_MOUNTAINEERS_IN_RAIDS.get()){
            Raid.WaveMember.create("mountaineer", ModEntityTypes.MOUNTAINEER.get(), new int[]{0, 0, 2, 0, 1, 4, 2, 5});
        }

        if(DungeonsMobsConfig.COMMON.ENABLE_ROYAL_GUARDS_IN_RAIDS.get()){
            Raid.WaveMember.create("royal_guard", ModEntityTypes.ROYAL_GUARD.get(), new int[]{0, 0, 1, 0, 0, 2, 1, 2});
        }
        
        // SPELLCASTER
        if(DungeonsMobsConfig.COMMON.ENABLE_GEOMANCERS_IN_RAIDS.get()){
            Raid.WaveMember.create("geomancer", ModEntityTypes.GEOMANCER.get(), new int[] {0, 0, 0, 0, 0, 1, 1, 2});
        }
        
        if(DungeonsMobsConfig.COMMON.ENABLE_ILLUSIONERS_IN_RAIDS.get()){
            Raid.WaveMember.create("illusioner", ModEntityTypes.ILLUSIONER.get(), new int[] {0, 0, 0, 0, 0, 1, 1, 2});
        }
        
        if(DungeonsMobsConfig.COMMON.ENABLE_MAGES_IN_RAIDS.get()){
            Raid.WaveMember.create("mage", ModEntityTypes.MAGE.get(), new int[] {0, 0, 1, 0, 0, 1, 0, 2});
        }
        
        if(DungeonsMobsConfig.COMMON.ENABLE_ICEOLOGERS_IN_RAIDS.get()){           
            Raid.WaveMember.create("iceologer", ModEntityTypes.ICEOLOGER.get(), new int[] {0, 0, 0, 0, 0, 1, 1, 2});
        }
        if(DungeonsMobsConfig.COMMON.ENABLE_WINDCALLERS_IN_RAIDS.get()){
            Raid.WaveMember.create("windcaller", ModEntityTypes.WINDCALLER.get(), new int[] {0, 0, 0, 0, 0, 1, 1, 2});
        }
        
        // BEAST / GOLEM
        if(DungeonsMobsConfig.COMMON.ENABLE_SQUALL_GOLEMS_IN_RAIDS.get()){
            Raid.WaveMember.create("squall_golem", ModEntityTypes.SQUALL_GOLEM.get(), new int[]{0, 0, 0, 1, 0, 1, 0, 2});
        }
        
        // BOSS
        if(DungeonsMobsConfig.COMMON.ENABLE_REDSTONE_GOLEMS_IN_RAIDS.get()){            
            Raid.WaveMember.create("redstone_golem", ModEntityTypes.REDSTONE_GOLEM.get(), new int[]{0, 0, 0, 0, 0, 0, 0, 1});
        }
    }
}
