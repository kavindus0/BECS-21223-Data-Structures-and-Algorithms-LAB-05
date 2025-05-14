package Question02;

public class Products {
    String name;
    int north;
    int south;
    int east;
    int totalSales;

    public Products(String name, int north, int south, int east) {
        this.name = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.totalSales = north + east +south;
    }

}
