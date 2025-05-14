package Question01;

public class Functions {
    List numberList = new List(6);


    void addElement(){
        numberList.insertLast(new Number(0, new int[]{0}));
        numberList.insertLast(new Number(1, new int[]{0, 2, 2, 4}));
        numberList.insertLast(new Number(2, new int[]{5}));
        numberList.insertLast(new Number(6, new int[]{5}));
        numberList.insertLast(new Number(7, new int[]{1, 8}));
        numberList.insertLast(new Number(8, new int[]{6}));
    }

    void view(){
        for (int i = 0; i < numberList.listSize(); i++) {
            System.out.println(numberList.retrieveListData(i));
        }
    }



}
