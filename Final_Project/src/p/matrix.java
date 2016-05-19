package p;
public class matrix {

    public static double[][] identity(int n) {
        double[][] I = new double[n][n];
        for (int i = 0; i < n; i++)
            I[i][i] = 1;
        return I;
    }

    public static double[][] create(double[][] d) {
        int n=d.length;
        int m=d[0].length;
    	double[][] I = new double[n][m];
        for (int i = 0; i < n; i++)
            for(int j=0; j < m; ++j)
            	I[i][j] = d[i][j];
        return I;
    }
    
    
    public static double dot(double[] x, double[] y) {
        if (x.length != y.length) throw new RuntimeException("Illegal vector dimensions.");
        double sum = 0.0;
        for (int i = 0; i < x.length; i++)
            sum += x[i] * y[i];
        return sum;
    }

    
    public static double[][] transpose(double[][] A) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[j][i] = A[i][j];
        return C;
    }

    public static double[][] dot(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] * B[i][j];
        return C;
    }
    public static double[][] dot_div(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] / B[i][j];
        return C;
    }
   
    public static double[][] add(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

   
    public static double[][] subtract(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }
    
    public static double[][] div(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] / B[i][j];
        return C;
    }
    public static double[][] mod(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] % B[i][j];
        return C;
    }
   
    public static double[][] add(double[][] A, double a) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + a;
        return C;
    }
    public static double[][] mod(double[][] A, double a) {
        int m = A.length;
        int n = A[0].length;
        double[][] C = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + a;
        return C;
    }
    public static double[] add(double[] A, double a) {
        int m = A.length;
        double[] C = new double[m];
        for (int i = 0; i < m; i++)
         
                C[i] = A[i] + a;
        return C;
    }
    public static double[] multiply(double[] A, double a) {
        int m = A.length;
        double[] C = new double[m];
        for (int i = 0; i < m; i++)
         
                C[i] = A[i] * a;
        return C;
    }
    
    public static double[][] multiply(double[][] A, double[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = B[0].length;
        if (nA != mB) throw new RuntimeException("Illegal matrix dimensions.");
        double[][] C = new double[mA][nB];
        for (int i = 0; i < mA; i++)
            for (int j = 0; j < nB; j++)
                for (int k = 0; k < nA; k++)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }
  
    public static double  determinant(double[][] matrix){ 
    	
        double sum=0; 
        double s;
        if(matrix.length==1){  
          return(matrix[0][0]);
        }
        for(int i=0;i<matrix.length;i++){ 
          double[][]smaller= new double[matrix.length-1][matrix.length-1];
          for(int a=1;a<matrix.length;a++){
            for(int b=0;b<matrix.length;b++){
              if(b<i){
                smaller[a-1][b]=matrix[a][b];
              }
              else if(b>i){
                smaller[a-1][b-1]=matrix[a][b];
              }
            }
          }
          if(i%2==0){ 
            s=1;
          }
          else{
            s=-1;
          }
          sum+=s*matrix[0][i]*(determinant(smaller)); 
        }
        return(sum); 
      }
    
    
    public static double[] multiply(double[][] A, double[] x) {
        int m = A.length;
        int n = A[0].length;
        if (x.length != n) throw new RuntimeException("Illegal matrix dimensions.");
        double[] y = new double[m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i] += A[i][j] * x[j];
        return y;
    }
   
    public static double[][] multiply(double[][] A, double x) {
        int m = A.length;
        int n = A[0].length;
  
        double[][] y = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i][j] = A[i][j] * x;
        return y;
    }

    public static double[] multiply(double[] x, double[][] A) {
        int m = A.length;
        int n = A[0].length;
        if (x.length != m) throw new RuntimeException("Illegal matrix dimensions.");
        double[] y = new double[n];
        for (int j = 0; j < n; j++)
            for (int i = 0; i < m; i++)
                y[j] += A[i][j] * x[i];
        return y;
    }

}


