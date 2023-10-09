package Abstractions;

// Абстракция класса фабрики

public abstract class ItemGenerator {

    // Метод взаимодествия с абстрактной продукцией
    // return содержимое из разных сундуков

    public String openReward() {
        iGameItem gameItem = createItem();
        return gameItem.open();
    }

    // Метод создания экземпляра продукта
    // return экземпляр продукта
    public abstract iGameItem createItem();
}
