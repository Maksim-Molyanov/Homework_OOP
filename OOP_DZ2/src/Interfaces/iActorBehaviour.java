package Interfaces;
/** Поведения Актора */
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();

}