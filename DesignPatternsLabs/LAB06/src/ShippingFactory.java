public class ShippingFactory {
    public static Shipping getShippingMethod(String type) {
        switch (type.toLowerCase()) {
            case "standard":
                return new StandardShipping();
            case "inpost":
                return new InpostShipping();
            case "courier":
                return new CourierShipping();
            default:
                throw new IllegalArgumentException("Nieznany typ wysyłki: " + type);
        }
}}
