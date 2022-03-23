package Programming.laba9.task2.task2;

public class MatrixExceptions {
    private int i;

    private int [][] Matrix= new int[i][i];

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void GetNewMatrix(int i){
        this.i=i;
        Matrix=new int[i][i];
        for (int j =0;j<Matrix.length;j++){
            for (int k=0;k<Matrix.length;k++){
                Matrix[j][k]=k;
                System.out.print(Matrix[j][k]);
            }
        }
    }
}
