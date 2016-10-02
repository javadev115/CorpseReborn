package org.golde.bukkit.corpsereborn.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.golde.bukkit.corpsereborn.ConfigData;
import org.golde.bukkit.corpsereborn.Main;
import org.golde.bukkit.corpsereborn.Util;

public class ReloadPlugin implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args){
		sender.sendMessage(ChatColor.GREEN + "Config reloaded.");
		Main.getPlugin().reloadConfig();
		Util.info("Loading corpses creator...");
		Main.getPlugin().loadCorpsesCreator();
		Util.info("Loading config data...");
		ConfigData.load();
		return true;
	}

}
