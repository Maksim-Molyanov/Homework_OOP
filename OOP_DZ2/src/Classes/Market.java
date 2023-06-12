package Classes;
import java.util.ArrayList;
import java.util.List;


import Interfaces.iMarketBehaviour;
import Interfaces.iActorBehaviour;
import Interfaces.iQueueBehaviour;
/** @class Магазин */
public class Market implements iMarketBehaviour, iQueueBehaviour {
    /**список покупателей/клиентов */
    private List<Actor> queue;

    /**Конструктор Магазина
     * без параметров
     */
    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    /**Метод уведомляет о том, что клиент зашел в магазин
     * @param список клинетов
     */

    /**Метод добавляет клиента в очередь
     * @param список клиентов */
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь!");


    }
    /**Метод уведомляет о том, что клиент зашел в магазин клинетов */
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " клиент пришел в магазин!");
        takeInQueue(actor);
    }

    /** Метод уведомляет об уходе клиента из магазина */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина!");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }


    /** Метод выдачи заказа */
    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " клиент получил свой заказ!");
            }
        }
    }
    /**Метод освбождающий очередь  */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " клиент ушел из очереди!");
            }
        }
        releaseFromMarket(releaseActors);
    }


    /**Метод принимающий заказ */
    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " клиент сделал заказ!");

            }
        }

    }
}