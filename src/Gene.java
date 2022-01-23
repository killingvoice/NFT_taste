import java.util.Random;

public class Gene {
    private static Gene singleton;
    Random random = new Random();
    
    static final private String[] _color           = new String[ 5];
    static final private String[] _ears            = new String[ 4];
    static final private String[] _eyes            = new String[11];
    static final private String[] _face            = new String[ 6];
    static final private String[] _face_detail_A   = new String[ 4];
    static final private String[] _face_detail_B   = new String[ 5];
    static final private String[] _forehead        = new String[ 2];
    static final private String[] _headwear        = new String[33];
    static final private String[] _headwear_detail = new String[ 1];
    static final private String[] _items           = new String[ 5];
    static final private String[] _mouth           = new String[ 1];
    static final private String[] _neck            = new String[ 4];

    static final private int color_per = 100;
    static final private int ears_per  = 70;
    static final private int eyes_per  = 85;
    static final private int face_per  = 100;
    static final private int face_detail_A_per = 50;
    static final private int face_detail_B_per = 50;
    static final private int forehead_per = 20;
    static final private int headwear_per = 90;
    static final private int headwear_detail_per = 15;
    static final private int items_per = 50;
    static final private int mouth_per = 20;
    static final private int neck_per  = 75;
    
    private Gene() {
        _color[0] = "red";
        _color[1] = "yellow";
        _color[2] = "green";
        _color[3] = "blue";
        _color[4] = "puple";
    
        _ears[0] = "Gold Earring";
        _ears[1] = "Jade Earring";
        _ears[2] = "Green Cross Earring";
        _ears[3] = "Red Cross Earring";
    
        _eyes[ 0] = "Normal Glasses";
        _eyes[ 1] = "Blue Clown Eyes";
        _eyes[ 2] = "Red Clown Eyes";
        _eyes[ 3] = "Nerd Glasses";
        _eyes[ 4] = "Ski Goggle";
        _eyes[ 5] = "VR Rainbow LED";
        _eyes[ 6] = "VR Jade LED";
        _eyes[ 7] = "Orange Eyebrow";
        _eyes[ 8] = "Horned Rim Glasses";
        _eyes[ 9] = "I dont know Eyes";
        _eyes[10] = "Shade Glasses";

        _face[0] = "Male";
        _face[1] = "Female";
        _face[2] = "Robot";
        _face[3] = "Tiger";
        _face[4] = "Monkey";
        _face[5] = "Rabbit";

        _face_detail_A[0] = "Orange Stripes";
        _face_detail_A[1] = "Spots";
        _face_detail_A[2] = "Mouth Spots";
        _face_detail_A[3] = "Green Cyclops Eye";

        _face_detail_B[0] = "Fightened Mouth";
        _face_detail_B[1] = "Smile";
        _face_detail_B[2] = "Purple Lip";
        _face_detail_B[3] = "Red Lip";
        _face_detail_B[4] = "Clown Mouth";

        _forehead[0] = "2 Color Band";
        _forehead[1] = "Red Victory Band";

        _headwear[ 0] = "Not Arranged Green";
        _headwear[ 1] = "Bucket Hat";
        _headwear[ 2] = "Hoodie";
        _headwear[ 3] = "Purple Cap with a Headset";
        _headwear[ 4] = "Green hair in Purple Cap";
        _headwear[ 5] = "Retro Cap";
        _headwear[ 6] = "Doge Hat";
        _headwear[ 7] = "Police Cap";
        _headwear[ 8] = "Blue Bandana";
        _headwear[ 9] = "Red Beanie";
        _headwear[10] = "Short Peak Cap";
        _headwear[11] = "Parted Pink";
        _headwear[12] = "Mohawk";
        _headwear[13] = "Pink Rabbit";
        _headwear[14] = "Blone with an Wing";
        _headwear[15] = "Rainbow Festival";
        _headwear[16] = "Metal Purple";
        _headwear[17] = "Headset with LED";
        _headwear[18] = "Mens Normal Blonde";
        _headwear[19] = "Pig Tails";
        _headwear[20] = "90s Brown Hair";
        _headwear[21] = "Blone in Ushanka";
        _headwear[22] = "Orange Side";
        _headwear[23] = "00s School Girl";
        _headwear[24] = "Metal Blue";
        _headwear[25] = "Witch Short";
        _headwear[26] = "Green with Edge Curl";
        _headwear[27] = "Tiara";
        _headwear[28] = "Monk";
        _headwear[29] = "Green Layers";
        _headwear[30] = "Peak Spike";
        _headwear[31] = "Red Alarm";
        _headwear[32] = "Normal Black Hair";

        _headwear_detail[0] = "Goggle on forehead";

        _items[0] = "Cigarette";
        _items[1] = "Candy Stick";
        _items[2] = "LED Gas Mask";
        _items[3] = "Normal Gas Mask";
        _items[4] = "Whistle";

        _mouth[0] = "Medical Mask";
        
        _neck[0] = "Gold Chain";
        _neck[1] = "Silver Chain";
        _neck[2] = "Red Scarf";
        _neck[3] = "Choker";
    }

    public static Gene getInstance() {
        if(singleton==null) {
            singleton = new Gene();
        }
        return singleton;
    }

    public String get_random_color() {
        if(random.nextInt(100) < color_per) {
            return _color[random.nextInt(_color.length)];
        }
        return "";
    }
    public String get_random_ears() {
        if(random.nextInt(100) < ears_per) {
            return _ears[random.nextInt(_ears.length)];
        }
        return "";
    }
    public String get_random_eyes() {
        if(random.nextInt(100) < eyes_per) {
            return _eyes[random.nextInt(_eyes.length)];
        }
        return "";
    }
    public String get_random_face() {
        if(random.nextInt(100) < face_per) {
            return _face[random.nextInt(_face.length)];
        }
        return "";
    }
    public String get_random_face_detail_A() {
        if(random.nextInt(100) < face_detail_A_per) {
            return _face_detail_A[random.nextInt(_face_detail_A.length)];
        }
        return "";
    }
    public String get_random_face_detail_B() {
        if(random.nextInt(100) < face_detail_B_per) {
            return _face_detail_B[random.nextInt(_face_detail_B.length)];
        }
        return "";
    }
    public String get_random_forehead() {
        if(random.nextInt(100) < forehead_per) {
            return _forehead[random.nextInt(_forehead.length)];
        }
        return "";
    }
    public String get_random_headwear() {
        if(random.nextInt(100) < headwear_per) {
            return _headwear[random.nextInt(_headwear.length)];
        }
        return "";
    }
    public String get_random_headwear_detail() {
        if(random.nextInt(100) < headwear_detail_per) {
            return _headwear_detail[random.nextInt(_headwear_detail.length)];
        }
        return "";
    }
    public String get_random_items() {
        if(random.nextInt(100) < items_per) {
            return _items[random.nextInt(_items.length)];
        }
        return "";
    }
    public String get_random_mouth() {
        if(random.nextInt(100) < mouth_per) {
            return _mouth[random.nextInt(_mouth.length)];
        }
        return "";
    }
    public String get_random_neck() {
        if(random.nextInt(100) < neck_per) {
            return _neck[random.nextInt(_neck.length)];
        }
        return "";
    }
}