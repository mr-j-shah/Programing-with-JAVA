class Matrix{
    int row,colum;
    float[][] mat = new float[5][5];

    Matrix(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                this.mat[i][j]=a[i][j];
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
    float[][] transpose(){
        float ans[][] = new float[5][5];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                mat[i][j]=ans[j][i];
            }
        }
        return ans;
    }
}

class prac2_4{
    public static void main(String args[])
    {
        int arr[][]={ {1,2,3} , {4,5,6} };
        Matrix a = new Matrix(arr);
        a.readMaatrix();
    }
}