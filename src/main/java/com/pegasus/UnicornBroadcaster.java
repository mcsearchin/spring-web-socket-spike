package com.pegasus;

import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.TimerTask;

public class UnicornBroadcaster extends TimerTask {

    static final String[] UNICORN_NAMES = {
            "Adiana: The fiery one",
            "Alairia: The cheerful one",
            "Alanala: Fair and Beautiful",
            "Albany: Fair of face",
            "Aletha: The Truthful one",
            "Alize: One who charms",
            "Allena: Peaceful and Attractive",
            "Amandaria: The Powerful one",
            "Amara: The Eternal one",
            "Andra: Strong and Courageous",
            "Angelina: The Angelic one",
            "Annamika: Full of Grace",
            "Astra: Bright as a Star",
            "Bennettia: Little blessed one",
            "Bellini: Simply beautiful",
            "Benicia: One who is blessed",
            "Biancha: Multicultural power",
            "Blissia: Perfect joy",
            "Boaz: Swift and strong",
            "Bonita: The pretty one",
            "Breanna: Pure and Virtuous",
            "Bryanne: The strong one",
            "Celina: From the moon",
            "Celestia: From the stars",
            "Clementine: The Gentle one",
            "Cortesia: The bold one",
            "Danika: Morning Star",
            "Della: The Noble one",
            "Demetrius: Lover of the Earth",
            "Denali: The great one",
            "Dessa: The Roamer",
            "Deva: Celestial Spirit",
            "Drisana: Child of the sun",
            "Dulcea: The Sweet one",
            "Duscha: Divine Spirit",
            "Electra: The Shining one",
            "Elita: The Chosen One",
            "Etana: Full of determination",
            "Eternia: Eternal friend",
            "Evania: Always tranquil",
            "Faith: To be trusted",
            "Felicia: Happiness always",
            "Fenella: The Fair One",
            "Fernaco: The Daring One",
            "Estrellita: Little Star",
            "Fleta: The Swift one",
            "Floriana: Prosperous",
            "Gerda: The protective one",
            "Giulio: Forever young",
            "Gratiana: The graceful one",
            "Grizelda: endless patience",
            "Gwynth: The fortunate one",
            "Hyacinthie: Fragrant Warmth",
            "Hylzarie: Lover of the moon",
            "Ira: The watchful one",
            "Iram: Shining bright",
            "Jada: Full of wisdom",
            "Julius: The young one",
            "Langaria: The tall one",
            "Laqueta : The quiet one",
            "Larissa: The cheerful one",
            "Leila: The Loyal One",
            "Lunaria: Of the moon",
            "Marcello: Brave and fearless",
            "Marjallo: She who is brave",
            "Matia: Mighty",
            "Mignon: Delicate and graceful",
            "Moriba: Seeker of knowledge",
            "Mystique: Full of mystery",
            "Necia: The intense one",
            "Nestor: seeker of wisdom",
            "Placido: calm and quiet",
            "Primara: The protector",
            "Samantha: The listener",
            "Serenity: Peaceful disposition",
            "Shakti: Divine",
            "Shanna: Small and wise",
            "Sheehan: Peacemaker",
            "Simona: One who hears",
            "Solange: The solitary one",
            "Tacita: The silent one",
            "Tomo: The intelligent one",
            "Tama: The perfect one",
            "Speranza: The Hopeful one",
            "Starburst: Full of light",
            "Suki: Beloved one",
            "Titanius: Fairies' friend",
            "Valeria: Strong and Healthy",
            "Vartouhi: As beautiful as a rose",
            "Wilda: The untamed",
            "Xaveria: The bright one",
            "Xenia: The hospitable one",
            "Zinnia: The creative one",
            "Zulema: Healthy and vigorous",
            "Yaser: The friendly one",
            "Yasmin: Always fragrant",
            "Yennaria: The placid one",
            "Yoriara: The reliable one",
            "Yashiana: The shy one",
            "Virgil: The Strong one"
    };

    private SimpMessagingTemplate messagingTemplate;

    private int nameIndex = 0;

    public UnicornBroadcaster(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Override
    public void run() {
        String newValue = UNICORN_NAMES[nameIndex % UNICORN_NAMES.length];
        System.out.println("New Value : " + newValue);
        messagingTemplate.convertAndSend("/topic/unicornNames", newValue);
        nameIndex++;
    }
}