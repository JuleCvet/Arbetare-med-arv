
package arbetaretyresojava2;

public abstract class  Arbetare extends Person{

    private String workPosition;
    private String beginToWorkDate;
    private String description;
    private double basicSalary;
    private int workId;
    
    public Arbetare(String fornamn, String efterNamn,String workPosition,
                    String beginToWorkDate, String description, int workId){
    super(fornamn, efterNamn);
    this.workPosition = workPosition;
    this.beginToWorkDate = beginToWorkDate;
    this.description = description;
    this.workId = workId;
    this.basicSalary = 25000;
    
    }
    
    public abstract double lon();
    //public int lon(int lon);

    public double getBasicSalary() {
        return basicSalary;
    }
    
  
  public int getworkId(){
   return workId;
   
   }
  
//    public void setWorkId(int workId) {
//        if(workId<1){
//            System.out.println("Not correct");
//            setWorkId(new Scanner(System.in).nextInt());
//        }
//        else
//            this.workId = workId;
//    }
    
   public String getWorkPosition(){
   return workPosition;
   
   }
   
   public String getBeginToWorkDate(){
   return beginToWorkDate;
   
   }
   
   public String getDescription(){
   return description;
   
   }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public void setBeginToWorkDate(String beginToWorkDate) {
        this.beginToWorkDate = beginToWorkDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
 
   
    @Override
    public String toString() {
        return super.toString() + "Work position is: " + workPosition + "  begin to work att date: "
                + beginToWorkDate + "   as a: " + description + "  and has legitimation number: " + workId; 
    }
}
