 package arbetaretyresojava2;

import java.util.Vector;

public class ManadsLoner {
    
    public static void main(String[] args) {
        
         Vector vector = new Vector();
//Arbetare[] arb= new Arbetare[4];
//arb[0] = new Chef("Marko", "Petrushevski", "Chef", "2011-01-25","Managing the school", 2);
//arb[1] = new  Administrator("Julijana", "Cvetkovska", "Administrator", "2017-03-25","Checking documentations", 5);
//arb[2] = new Larare("Mariela", "Jovanoska", "Larare", "2015-03-05","teaching Filosofy", 3);
//arb[3] = new Chef("Marielko", "Petru", "Chef", "2013-06-25","Managing the school6", 6);
//int[] lon = {arb[0].lon(45000),arb[1].lon(35000), arb[2].lon(25000),arb[4].lon(45000),};
//for(int i = 0; i<arb.length; i++){String str = arb[i]+"\nlon"+lon[i]; sout(str);}
         
         
        Administrator adm1 = new Administrator("Julijana", "Cvetkovska", "Administrator", "2017-03-25",
            "Checking documentations", 5);
        Larare lar1 = new Larare("Mariela", "Jovanoska", "Larare", "2015-03-05",
            "teaching Filosofy", 3);
        Chef chef1 = new Chef("Marko", "Petrushevski", "Chef", "2011-01-25",
            "Managing the school", 2);
        
        vector.add(chef1);
        vector.add(lar1);
        vector.add(adm1);
        
        for (Object object : vector) {
            System.out.println(object);
            
        }
       
        System.out.println(chef1.lon());
        System.out.println(adm1.lon()); 
        System.out.println(adm1.getBasicSalary());
        System.out.println(lar1.getBasicSalary());
        System.out.println(lar1.lon());
        
    }
}
