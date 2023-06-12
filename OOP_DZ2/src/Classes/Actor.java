package Classes;

import Interfaces.iActorBehaviour;
/**
 * Абстрактный класс Актор
 */
public abstract class Actor implements iActorBehaviour {
    /**
     * имя клиента
     */
    protected String name;
    /* */
    protected Boolean isTakeOrder;
    protected Boolean isMakeOrder;
    protected Boolean goodsCheck;

    /**
     * Конструктор Актора
     *
     * @param name
     */
    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
        this.goodsCheck = false;
    }

    public abstract String getName();
}