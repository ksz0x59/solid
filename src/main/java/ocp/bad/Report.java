package ocp.bad;

class Report {

    enum Type {
        ORDERS_PER_DAY, ORDERS_PER_WEEK,  CONVERSION_RATES
    }

    private Type type;

    String generate() {
        // some stuff
        switch (type) {
            case ORDERS_PER_DAY:
                // do stuff
                return "Orders per day :";
            case ORDERS_PER_WEEK:
                // do stuff
                return "Orders per week";
            case CONVERSION_RATES:
                // do stuff
                return "Convertion rates";
            default:
                return "none";
        }
        // more stuff
        // adding more stuff and modifying existing class
    }
}
