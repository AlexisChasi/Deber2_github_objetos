public class Vehiculos {
    String Placa;
    String Propietario;
    String Marca;
    String Modelo;
    int year;

//METODOS
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //CONSTRUCTORES
    public Vehiculos (String Pvehiculo, String Vpropietario, String Vmarca, String Vmodelo, int Vyear){

        Placa=Pvehiculo;
        Propietario=Vpropietario;
        Marca=Vmarca;
        Modelo=Vmodelo;
        year=Vyear;
    }
}
