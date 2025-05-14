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

    String bestProductOfRgion(){
        String productName = null;
        int initia = 0;
        for (int i = 0; i < 4; i++) {
            if (list.retrieveList(i).north > initia){
                productName = list.retrieveList(i).name;
            }
        }
        System.out.println(productName);
       return productName;
    }


}
