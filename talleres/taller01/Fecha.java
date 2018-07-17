public class Fecha {
    private byte dia, mes;
    private short anio;
    public Fecha(byte dia, byte mes, short anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public byte dia() {
        return dia;
    }

    public byte mes() {
        return mes;
    }

    public short anio() {
        return anio;
    }

    // -1 si esta fecha es anterior a la otra
    // 0 si son iguales
    // 1 si esta fecha es posterior a la otra
    public int comparar(Fecha otra) {
        if(anio > otra.anio()) {
            return 1;
        } else if(anio < otra.anio()){
            return -1;
        } else if (mes < otra.mes()){
            return -1;
        } else if (mes > otra.mes()){
            return 1;
        } else if (dia < otra.dia()){
            return -1;
        } else if (dia > otra.dia()){
            return 1;
        } else {
            return 0;
        }
    }


    public String toString() {
        String fecha = dia+"/"+mes+"/"+anio;
        return fecha;
    }
}