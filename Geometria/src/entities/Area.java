package entities;

public class Area {
    public double A, B, C;

    public double areaRetangulo(){
        return (A*B);
    }
    public double areaQuadrado(){
        return (A*A);
    }
    public double areaTriangulo(){
        return(A*B)/2;
    }
    public double areaLosango(){
        return(A*B)/2;
    }
    public double areaCirculo(){
        return Math.PI*(A*A);
    }


}
