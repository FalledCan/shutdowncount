package xyz.sirosan.shutdown_count;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.scheduler.BukkitRunnable;

public class Shutdown_Count_Cmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 1){

            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e){
                sender.sendMessage("§6[§cShutdown Count§6] §c/sdc [count(sec)] [reason]");
                return true;
            }

            int get_count = Integer.parseInt(args[0]);

            if(1 > get_count){
                sender.sendMessage("§6[§cShutdown Count§6] §c/sdc [count(sec)] [reason]");
                return true;
            }

            int Minutes = get_count / 60;
            int sec = get_count % 60;

            if(Minutes < 1)
                Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが" + sec + "秒後に再起動します");
            else
                Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが" + Minutes + "分" + sec + "秒後に再起動します。");
            BukkitRunnable task = new BukkitRunnable() {

                int count = get_count;

                @Override
                public void run() {

                    if(count == 1800)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが30分後に再起動します。");
                    else if (count == 600)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが10分後に再起動します。");
                    else if (count == 300)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが5分後に再起動します。");
                    else if (count == 60)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが1分後に再起動します。");
                    else if (count == 30)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが30秒後に再起動します。");
                    else if (count == 10)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが10秒後に再起動します。");
                    else if (count == 5)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが5秒後に再起動します。");
                    else if (count == 4)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが4秒後に再起動します。");
                    else if (count == 3)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが3秒後に再起動します。");
                    else if (count == 2)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが2秒後に再起動します。");
                    else if (count == 1)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが1秒後に再起動します。");
                    else if (count == 0){
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが再起動します。");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(),"stop");
                        cancel();
                    }
                    count--;
                }
            };
            task.runTaskTimer(Shutdown_Count.getPlugin(),0L,20L);

        }else if (args.length > 1){

            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e){
                sender.sendMessage("§6[§cShutdown Count§6] §c/sdc [count(sec)] [reason]");
                return true;
            }

            int get_count = Integer.parseInt(args[0]);

            if(1 > get_count){
                sender.sendMessage("§6[§cShutdown Count§6] §c/sdc [count(sec)] [reason]");
                return true;
            }

            StringBuilder reason = new StringBuilder();
            for(int i = 1; i < args.length; i++) {
                reason.append(args[i]).append(" ");
            }
            int Minutes = get_count / 60;
            int sec = get_count % 60;

            if(Minutes < 1) {
                Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが" + sec + "秒後に再起動します。");
            } else {
                Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが" + Minutes + "分" + sec + "秒後に再起動します。");
            }
            Bukkit.broadcastMessage("§8[§4Server§8] §f理由:" + reason);
            BukkitRunnable task = new BukkitRunnable() {

                int count = get_count;

                @Override
                public void run() {

                    if(count == 1800)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが30分後に再起動します。");
                    else if (count == 600)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが10分後に再起動します。");
                    else if (count == 300)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが5分後に再起動します。");
                    else if (count == 60)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが1分後に再起動します。");
                    else if (count == 30)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが30秒後に再起動します。");
                    else if (count == 10)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが10秒後に再起動します。");
                    else if (count == 5)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが5秒後に再起動します。");
                    else if (count == 4)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが4秒後に再起動します。");
                    else if (count == 3)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが3秒後に再起動します。");
                    else if (count == 2)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが2秒後に再起動します。");
                    else if (count == 1)
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが1秒後に再起動します。");
                    else if (count == 0){
                        Bukkit.broadcastMessage("§8[§4Server§8] §fサーバーが再起動します。");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(),"stop");
                        cancel();
                    }
                    count--;
                }
            };
            task.runTaskTimer(Shutdown_Count.getPlugin(),0L,20L);

        }else {
            sender.sendMessage("§6[§cShutdown Count§6] §c/sdc [count(sec)] [reason]");
        }

        return true;
    }
}
