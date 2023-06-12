package Interfaces;

import Classes.Actor;
/** Поведения возврата */
public interface iReturnOrder {
    void purchasceReturn(Actor actor);
    boolean goodsCheck();
    void productApproved(Actor actor);

}