package lesson12.exerscise3;

/**
 * a) Создать перечисление, содержащее размеры одежды (XXS,XS,S,M,L).
 * Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 * Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 * Также перечисление должно содержать числовое значение euroSize, соответствующее каждому размеру.
 * Создать конструктор, принимающий на вход euroSize.
 */
public enum ClothingSize {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
