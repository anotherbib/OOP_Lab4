public class CustomerFactory {
    
    public static Customer createCustomer(String customerType){
        switch(customerType) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
        }
        return null;
    }
    
}
