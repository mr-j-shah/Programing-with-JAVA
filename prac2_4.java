class Matrix{
    int row,colum;
    float[][] mat = new float [5][5];

    Matrix(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                mat[i][j]=a[i][j];
            }
        }
    }
    Matrix(){

    }
    Matrix(int row,int col){

    }
    void readMaatrix(){
        for (float[] element : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(element[j]+"  ");
            }
            System.out.print("\n");
        }
    }
    float [][] transpose(){
        float[][] a = new float [5][5];
        a=mat;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; i < a.length; i++) {
                mat[j][i]=a[i][j];
            }
        }
        return mat;
    }
}

class prac2_4{
    public static void main(String args[])
    {
        int arr[][]={ {1,2,3} , {4,5,6},{7,8,9}};
        Matrix a = new Matrix(arr);
        a.readMaatrix();
        a.mat=a.transpose();
        System.out.println("next");
        a.readMaatrix();
    }
}