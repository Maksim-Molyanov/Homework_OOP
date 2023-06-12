package Interfaces;

import Classes.Actor;
/**@interface Поведения очереди */
public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}