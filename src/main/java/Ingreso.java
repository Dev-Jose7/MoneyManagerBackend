public class Ingreso extends Transaction{
    private static String type = "Ingreso";

    public Ingreso(int user, double value, String description, String category){
        super(user, Ingreso.type, value, description, category);
        super.ingresos.add(this);
        super.printData();
    }
}
