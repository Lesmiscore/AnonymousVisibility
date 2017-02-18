package com.nao20010128nao.AnonymousVisibility

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.plugin.PluginBase

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

/**
 * Created by nao on 2017/02/17.
 */
class PluginMain extends PluginBase implements Listener{
    BufferedImage steve

    @Override
    void onEnable() {
        this.getClass().classLoader.getResourceAsStream("steve.png").withStream {
            steve= ImageIO.read(it)
        }
        server.pluginManager.registerEvents(this,this)
    }

    @Override
    void onDisable() {

    }


    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event){
        def player=event.player
        player.skin.model="normal"
        player.skin.parseBufferedImage(steve)
        player.displayName="§a§ka§b§kb§c§kc§d§kd§e§ke§f§kf§r"
    }
}
