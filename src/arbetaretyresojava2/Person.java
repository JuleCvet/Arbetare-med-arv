
package arbetaretyresojava2;

    public class Person {
    private String fornamn;
    private String efterNamn;
    private int id;
    private static int counterId = 0;
    
    public Person(String fornamn, String efterNamn){
    id = counterId;
    counterId++;
    this.fornamn = fornamn;
    this.efterNamn = efterNamn;
    
    }

    public int getId() {
        return id;
    }
    
    public String getFornamn() {
        return fornamn;
    }

    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }

    @Override
    public String toString() {
        return "Fornamn:  " + fornamn + ", efter namn:  " + efterNamn + ", id = " + id + ", ";
        
    } 
}
