package latihan8;

public class latihan implements I1, D1 {
   double angka;
    
    public void setAngka(double angka){
        this.angka = angka;
    }
    public double getAngka(){
        return angka;
    }
    @Override
    public void methodI1(){
        System.out.println(angka+" termasuk bilangan dengan tipe data Integer");
    }
    @Override
    public void methodD1(){
        System.out.println(angka+" termasuk bilangan dengan tipe data Double");
    }
    
    
}
