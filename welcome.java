//CODE
package Events;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Welcome extends ListenerAdapter {

    public class GuildMemberJoin extends ListenerAdapter {

        String[] messages = {
"[üye] katıldı. Ek direkler inşa etmelisiniz.",
                "[Üye]'den asla vazgeçmem. [Üye]'yi asla yarı yolda bırakma!",
                "Hey! Dinle! [üye] katıldı!",
                "Ha! [üye] katıldı! Tuzak kartımı etkinleştirdin!",
                "Seni bekliyorduk [üye].",
                "Yalnız gitmek tehlikeli, [üye] alın!",
                "Swoooosh. [üye] az önce indi.",
                "Kendinizi hazırlayın. [üye] sunucuya yeni katıldı.",
                "Vahşi bir [üye] ortaya çıktı."
        };

        public void onGuildMemberJoin(GuildMemberJoinEvent event) {
            Random rand = new Random();
            int number = rand.nextInt(messages.length);

            EmbedBuilder join = new EmbedBuilder();
            join.setColor(0x66d8ff);
            join.setDescription(messages[number].replace("[üye]", event.getMember().getAsMention()));

            event.getGuild().getDefaultChannel().sendMessage(join.build()).queue();
        }
    }
}
