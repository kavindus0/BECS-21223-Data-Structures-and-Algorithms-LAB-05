package Question02;

public class Functions {
    List list = new List(4);

    void addData(){
        Products productA = new Products("A", 1450, 467, 3800);
        Products productB = new Products("B", 5678, 4892, 2791);
        Products productC = new Products("C", 2987, 270, 6983);
        Products productD = new Products("D", 829, 1500, 29);
        list.insertLast(productA);
        list.insertLast(productB);
        list.insertLast(productC);
        list.insertLast(productD);
    }

    String bestProductOfRgionNorth(){
        String productName = null;
        int initia = 0;
        for (int i = 0; i < 4; i++) {
            if (list.retrieveList(i).north > initia){
                initia = list.retrieveList(i).north;
                productName = list.retrieveListData(i);
            }
        }
        System.out.println(" North \t" +productName+" - " + initia);
       return productName;
    } 
    
    String bestProductOfRgionSouth(){
        String productName = null;
        int initia = 0;
        for (int i = 0; i < 4; i++) {
            if (list.retrieveList(i).south > initia){
                initia = list.retrieveList(i).south;
                productName = list.retrieveListData(i);
            }
        }
        System.out.println(" South \t" +productName + " - " + initia);
       return productName;
    }
    String bestProductOfRgionEast(){
        String productName = null;
        int initia = 0;
        for (int i = 0; i < 4; i++) {
            if (list.retrieveList(i).east > initia){
                initia = list.retrieveList(i).east;
                productName = list.retrieveListData(i);
            }
        }
        System.out.println(" East \t" +productName+" - " + initia);
       return productName;
    }

    String bestofQuarter(){
        String productName = null;
        int initia = 0;
        for (int i = 0; i < 4; i++) {
            if (list.retrieveList(i).totalSales > initia){
                initia = list.retrieveList(i).totalSales;
                productName = list.retrieveListData(i);
            }
        }
        System.out.println(" \n\nTotal Best All Quarter Sale :\t" +productName+" - " + initia);
       return productName;
    }

}
