// NFT gene class

public class Taster {
    int    _id;
    String _color;
    String _ears;
    String _eyes;
    String _face;
    String _face_detail_A;
    String _face_detail_B;
    String _forehead;
    String _headwear;
    String _headwear_detail;
    String _items;
    String _mouth;
    String _neck;
    
    Taster(int _id, String _color, String _ears, String _eyes, String _face, String _face_detail_A, String _face_detail_B, 
           String _forehead, String _headwear, String _headwear_detail, String _items, String _mouth, String _neck) {
        this._id = _id;
        this._color = _color;
        this._ears = _ears;
        this._eyes = _eyes;
        this._face = _face;
        this._face_detail_A = _face_detail_A;
        this._face_detail_B = _face_detail_B;
        this._forehead = _forehead;
        this._headwear = _headwear;
        this._headwear_detail = _headwear_detail;
        this._items = _items;
        this._mouth = _mouth;
        this._neck = _neck;
    }
    public void print() {
        System.out.println("==========================");
        System.out.println("_id              : " + this._id              );
        System.out.println("_color           : " + this._color           );
        System.out.println("_ears            : " + this._ears            );
        System.out.println("_eyes            : " + this._eyes            );
        System.out.println("_face            : " + this._face            );
        System.out.println("_face_detail_A   : " + this._face_detail_A   );
        System.out.println("_face_detail_B   : " + this._face_detail_B   );
        System.out.println("_forehead        : " + this._forehead        );
        System.out.println("_headwear        : " + this._headwear        );
        System.out.println("_headwear_detail : " + this._headwear_detail );
        System.out.println("_items           : " + this._items           );
        System.out.println("_mouth           : " + this._mouth           );
        System.out.println("_neck            : " + this._neck            );
        System.out.println("=========================");
    }
}
