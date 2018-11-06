package za.co.entelect.mojo.old.refactoring.a.problem;

public class IndianaJones {
    private static final double AVERAGE_RATING = 5.0;
    private IndianaJonesType type;

    public double getRating() {
        switch (type) {
            case LOST_ARK:
                return calculateLostArkRating();
            case LAST_CRUSADE:
                return AVERAGE_RATING + 3.5;
            case TEMPLE_OF_DOOM:
                return AVERAGE_RATING + 3.0;
            case KINGDOM_OF_THE_CRYSTAL_SKULL:
                return AVERAGE_RATING - 2.0;
        }
        return AVERAGE_RATING;
    }

    // TODO: Add more domain logic to motivate polymorphism like this
    private double calculateLostArkRating() {
        return AVERAGE_RATING + 4.0;
    }
}
