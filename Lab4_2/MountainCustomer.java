public class MountainCustomer extends Customer {
    @Override
    public String createMail() {
        return "Mountain Customer Mail";
    }
    public String createBrochure(){
        return "Mountain Customer Brochure";
    }
}
