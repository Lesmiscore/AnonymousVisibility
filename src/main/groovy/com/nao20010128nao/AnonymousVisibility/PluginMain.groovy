package com.nao20010128nao.AnonymousVisibility

import cn.nukkit.event.EventHandler
import cn.nukkit.event.Listener
import cn.nukkit.event.player.PlayerJoinEvent
import cn.nukkit.plugin.PluginBase

/**
 * Created by nao on 2017/02/17.
 */
class PluginMain extends PluginBase implements Listener{
    @Override
    void onEnable() {
        server.pluginManager.registerEvents(this,this)
    }

    @Override
    void onDisable() {

    }


    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event){
        def player=event.player
        player.skin.model="normal"
        player.skin.data=null
    }
}
