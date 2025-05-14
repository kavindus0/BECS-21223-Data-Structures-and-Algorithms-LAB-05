package Question01;

public class Number {
    int stem;
    int[] leaves;

    public Number(int stem, int[] leaves) {
        this.stem = stem;
        this.leaves = leaves;
    }

    String viewNumbers(){
        for (int leaf:leaves ) {
            System.out.print(stem + ""+leaf + " ");
        }
        return " ";
    }
}
