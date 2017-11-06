package lesson12.exerscise2;

public class AtelierDemo {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[6];
        clothes[0] = new Tie(ClothingSize.M, 271.5, "синий");
        clothes[1] = new Skirt(ClothingSize.S, 875, "жёлтый");
        clothes[2] = new TShirt(ClothingSize.S, 320, "зелёный");
        clothes[3] = new TShirt(ClothingSize.L, 450, "серый");
        clothes[4] = new Trousers(ClothingSize.S, 570, "белый");
        clothes[5] = new Trousers(ClothingSize.L, 630, "серый");
        Atelier.clotheWomen(clothes);
        System.out.println();
        Atelier.clotheMen(clothes);
    }
}
