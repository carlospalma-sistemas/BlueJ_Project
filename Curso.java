public class Curso
{
    private String nombre;
    private double[] porcentajes;
    private double[] notas;
    
    public Curso() {
        this.nombre = "";
        this.porcentajes = new double[] {0.30, 0.30, 0.40};
        this.notas = new double[3];
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }
    
    public double getNota(int index){
        return this.notas[index];
    }

    public void setNota(double nota, int index){
        this.notas[index] = nota;
    }
    
    public double getNotaFinal() {
        double acum = 0;
        for (int i=0; i<notas.length; i++) {
            acum += notas[i] * porcentajes[i];
        }
        return acum;
    }
    
    @Override
    public String toString() {
        return "Curso: "+ this.nombre + " Promedio:"  + String.format("%.2f", getNotaFinal());
    }
    
}