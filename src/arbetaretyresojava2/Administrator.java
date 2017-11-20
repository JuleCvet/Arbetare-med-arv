
package arbetaretyresojava2;

public class Administrator extends Arbetare{

    public Administrator(String fornamn, String efterNamn, String workPosition, String beginToWorkDate,
            String description, int workId) {
        super(fornamn, efterNamn, workPosition, beginToWorkDate, description, workId);
       
    } 


    @Override
    public String toString() {
        return super.toString(); 
    }   

    
      @Override
     public double lon() {
       return (this.getBasicSalary() * 0.5) + this.getBasicSalary();
            //return super.lon(lon); 
    }
}