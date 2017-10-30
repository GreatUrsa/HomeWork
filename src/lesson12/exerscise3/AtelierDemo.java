package lesson12.exerscise3;

public class AtelierDemo {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[6];
        clothes[0] = new Tie("M", 271.5, "синий");
        clothes[1] = new Skirt("S", 875, "жёлтый");
        clothes[2] = new TShirt("S", 320, "зелёный");
        clothes[3] = new TShirt("L", 450, "серый");
        clothes[4] = new Trousers("S", 570, "белый");
        clothes[5] = new Trousers("L", 630, "серый");
        Atelier atelier = new Atelier();
        atelier.clotheWomen(clothes);
        System.out.println();
        atelier.clotheMen(clothes);
    }
}
