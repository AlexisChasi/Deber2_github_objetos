public class Main {
    public static void main(String[] args) {
        Vehiculos Vehiculo1=new Vehiculos("GUA-070","JOSE PERALTA","CHEVROLET","AVEO",2006);
        Vehiculos Vehiculo2=new Vehiculos("AMB-080","MARIA SORNOZA","KIA","PICANTO",2009);
        Vehiculos Vehiculo3=new Vehiculos("UIO-090","FERNANDO MUSLERA","MERCEDES BENZ ","CLASE-C",2022);
        Vehiculos Vehiculo4=new Vehiculos("GAL-100","KAEL JACKSON","HYUNDAI","ELANTRA",2015);
        Vehiculos Vehiculo5=new Vehiculos("LOJ-110","BRUCE WAYNE","ROLLS-ROYCE","PHANTOM",2022);
        System.out.println("\tVEHICULOS");
        System.out.println("VEHICULO 1\n "+"PLACA: "+Vehiculo1.getPlaca()+" PROPIETARIO: "+Vehiculo1.getPropietario()+" MARCA: "+Vehiculo1.getMarca()+" MODELO: "+Vehiculo1.getModelo()+" AÑO: "+Vehiculo1.getYear());
        System.out.println("VEHICULO 2\n "+"PLACA: "+Vehiculo2.getPlaca()+" PROPIETARIO: "+Vehiculo2.getPropietario()+" MARCA: "+Vehiculo2.getMarca()+" MODELO: "+Vehiculo2.getModelo()+" AÑO: "+Vehiculo2.getYear());
        System.out.println("VEHICULO 3\n "+"PLACA: "+Vehiculo3.getPlaca()+" PROPIETARIO: "+Vehiculo3.getPropietario()+" MARCA: "+Vehiculo3.getMarca()+" MODELO: "+Vehiculo3.getModelo()+" AÑO: "+Vehiculo3.getYear());
        System.out.println("VEHICULO 1\n "+"PLACA: "+Vehiculo4.getPlaca()+" PROPIETARIO: "+Vehiculo4.getPropietario()+" MARCA: "+Vehiculo4.getMarca()+" MODELO: "+Vehiculo4.getModelo()+" AÑO: "+Vehiculo4.getYear());
        System.out.println("VEHICULO 1\n "+"PLACA: "+Vehiculo5.getPlaca()+" PROPIETARIO: "+Vehiculo5.getPropietario()+" MARCA: "+Vehiculo5.getMarca()+" MODELO: "+Vehiculo5.getModelo()+" AÑO: "+Vehiculo5.getYear());

    }
}