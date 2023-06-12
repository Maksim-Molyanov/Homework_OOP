package Interfaces;

import java.util.List;

import javax.swing.Action;

import Classes.Actor;
/**@interface Поведения Магазина */
public interface iMarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}