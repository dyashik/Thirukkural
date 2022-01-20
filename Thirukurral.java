
public class Thirukurral {
    String kural;
    String tanglish_kural;
    String eng_kural;
    String def;
    int num;
    String category;

    public Thirukurral(String kural, String tanglish_kural, String eng_kural, String def, int num){
        this.kural = kural;
        this.tanglish_kural = tanglish_kural;
        this.eng_kural = eng_kural;
        this.def = def;
        this.num = num;
        category = section(num);
    }

    public String toString(){
        String s = "------------------------";
        s += "\n";
        s += "Thirukkural of the Day [" + num + "]" + "\n" + "\n";
        s += "Category: " + category + "\n";
        s += "\n";
        s += "Kural: " + kural;
        s += "\n";
        s += "Tanglish Kural: " + tanglish_kural;
        s += "\n";
        s += "Definition: " + def;
        s += "\n";
        s += "------------------------";
        return s;
    }

    public String section(int num){
        if(num <= 10){
            return "The Praise of God";
        } else if(num <= 20){
            return "The Blessing of Rain";
        } else if(num <= 30){
            return "The Greatness of Ascetics";
        } else if(num <= 40){
            return "Assertion of the Strength of Virtue";
        } else if(num <= 50){
            return "Domestic Life";
        } else if(num <= 60){
            return "The Worth of a Wife";
        } else if(num <= 70){
            return "The Wealth of Children";
        } else if(num <= 80){
            return "The Posession of Love";
        } else if(num <= 90){
            return "Hospitality";
        } else if(num <= 100){
            return "The Utterance of Pleasant Words";
        } else if(num <= 110){
            return "Gratitude";
        } else if(num <= 120){
            return "Impartiality";
        } else if(num <= 130){
            return "The Posession of Self-Restraint";
        } else if(num <= 140){
            return "The Possession of Decorum";
        } else if(num <= 150){
            return "Not Wanting Another's Wife";
        } else if(num <= 160){
            return "The Possession of Patience";
        } else if(num <= 170){
            return "Not Envying";
        } else if(num <= 180){
            return "Not Coveting";
        } else if(num <= 190){
            return "Not Backbiting";
        } else {
            return "Against Vain Speaking";
        }
    }





}
