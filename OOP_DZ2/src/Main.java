import Classes.*;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        OrdinaryClient client1 = new OrdinaryClient("Boris");
        OrdinaryClient client2 = new OrdinaryClient("Dasha");
        SpecialClient client3 = new SpecialClient("Prezident", 1);
        PromoClient promClient = new PromoClient("Vasiliy", 123);
        TaxService taxService = new TaxService("Tax audit");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(taxService);

        market.update();

        client1.purchasceReturn(client1);
        client3.purchasceReturn(client3);
        promClient.purchasceReturn(promClient);
        taxService.purchasceReturn(taxService);
    }
}