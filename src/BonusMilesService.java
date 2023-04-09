public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int priceToMille = 20;
        int bonusMille = ticketPrice / priceToMille;
        return bonusMille;
    }
}
