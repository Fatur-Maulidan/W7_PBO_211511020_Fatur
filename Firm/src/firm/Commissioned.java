package firm;
public class Commissioned extends Hourly{
    protected double commision;
    protected int totalSales;
    public Commissioned(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commision){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        totalSales = 0;
        this.commision = commision;
    }
    
    public void addSales(int totalSales){
        this.totalSales += totalSales;
    }
    
    public double pay(){
        double payment = super.pay() + totalSales * commision;
        totalSales = 0;
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
