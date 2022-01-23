//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Taster tasters[] = new Taster[10000];
        Gene gene = Gene.getInstance();
        
        for(int i=0; i<10000; i++) {
            String _color = gene.get_random_color();
            String _ears = gene.get_random_ears();
            String _eyes = gene.get_random_eyes();
            String _face = gene.get_random_face();
            String _face_detail_A = gene.get_random_face_detail_A();
            String _face_detail_B = gene.get_random_face_detail_B();
            String _forehead = gene.get_random_forehead();
            String _headwear = gene.get_random_headwear();
            String _headwear_detail = gene.get_random_headwear_detail();
            String _items = gene.get_random_items();
            String _mouth = gene.get_random_mouth();
            String _neck = gene.get_random_neck();
            tasters[i] = new Taster(i, _color, _ears, _eyes, _face, _face_detail_A, _face_detail_B, 
                                    _forehead, _headwear, _headwear_detail, _items, _mouth, _neck);
        }

        //Scanner sc = new Scanner(System.in);
        //int num = 0;
        //while(num != -1) {
        //    num = sc.nextInt();
        //    if(num < 0 || num > 10000) break;
        //    tasters[num].print();
        //}
    }

}
