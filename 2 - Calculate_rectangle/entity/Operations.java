package Entities;

public class Operations {
    public double widthRet;
    public double heightRet;

    public double Area(){
        return widthRet * heightRet;
    }

    public double Perimeter(){
        return (widthRet + heightRet) * 2.0;
    }

    public double Diagonal(){
        return widthRet * heightRet - (widthRet + heightRet);
    }
}
