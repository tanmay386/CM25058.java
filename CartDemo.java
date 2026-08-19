class Cart {

    // Single item
    double calculateTotal(double price) {
        return price;
    }

    // Multiple items of same type
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // Multiple items + discount
    double calculateTotal(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
}

class CartDemo {
    public static void main(String[] args) {
        Cart c = new Cart();

        System.out.println("Single item: Rs. " + c.calculateTotal(500));

        System.out.println("Multiple items: Rs. "
                + c.calculateTotal(500, 3));

        System.out.println("With discount: Rs. "
                + c.calculateTotal(500, 3, 10));
    }
}