package io.github.xdghost.hello_world;


import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("hello_world")
@Mod.EventBusSubscriber
public class Main {

    //玩家加入游戏
    @SubscribeEvent
    public static void  playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        Level level = player.level;

        player.sendMessage(new TextComponent("hello<" + player.getDisplayName().getString()  + ">.From"+(level.isClientSide()?"CLIENT":"SERVER")), Util.NIL_UUID);

    }
}
