/**
 * Write a description of TeamZeta here.
 * 
 * @author (Kushagra verma) 
 */
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.util.*;  

public class TeamZeta 
{    
    public static void main(String[] args) 
    {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        /*Scanner s=new Scanner(System.in);  
        System.out.println("Enter the amount of water");
        int val = s.nextInt();
        System.out.println("Enter the type of crop");
        String crop =  s.nextLine(); 
        System.out.println("Enter the type of soil");
        String soil =  s.nextLine();*/ 
    }
    public static void Check_level( String crop,CSVParser parser,String soil,int val)
    {
         for (CSVRecord record : parser) 
         {
             String cropN=record.get("crop_name");
             if(cropN==crop)
             {
                 for (CSVRecord record1 : parser) 
                 {
                     String soilT=record1.get("soil_type");
                     if(soilT==soil)
                     {
                         String hig_lim_mm=record1.get("hig_lim_mm");
                         String low_lim_mm=record1.get("low_lim_mm");
                         int hig_lim=Integer.parseInt("hig_lim_mm"); 
                         int low_lim=Integer.parseInt("low_lim_mm"); 
                         System.out.println(hig_lim);
                         if(val<=low_lim && val>=hig_lim)
                        {
                            System.out.println("The moisture level is optimal");
                        }
                         else if(val<=low_lim)
                         {
                             System.out.println("Moisture level is low");
                         }
                         else
                         {
                             System.out.println("The moisture level is ");
                         }
                    }
                 }
            }
        }
    }
}