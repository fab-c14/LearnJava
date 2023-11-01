class Laptop {
    String model;
    int price;
    String serial;

    public String toString() {
        // return "Hi";//
        return model + " " + price;
    }

    // // do not do this,let us use or id use source action select what you want to
    // compare NOTE : I used vs code and installed some exensions

    // @Override -- annotation we learn that later
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    //
    // @Override annotions- discuss them later in code
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    // to this generate by ide

    // public boolean equals(Laptop that) {

    // // if (this.model.equals(this.model) && this.price == that.price) {
    // // return true;
    // // } else {
    // // return false;
    // // }
    // return (this.model.equals(this.model) && this.price == that.price);
    // }

}

public class ObjectClass {
    // every class in java extends object class ,so what is there in object class
    public static void main(String args[]) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenova";
        obj1.price = 100;
        // System.out.println(obj1);// will print something like this // Laptop@80098//
        // here automaticall .toString
        // is getting invoked

        Laptop obj2 = new Laptop();
        obj2.model = "Lenova";
        obj2.price = 100;

        boolean result = obj1.equals(obj2);
        System.out.println(result);

    }
}
