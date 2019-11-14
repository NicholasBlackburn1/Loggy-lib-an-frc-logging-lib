package Loggie.lib;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Loggingcvs{

    public String logname = "";
    public String logTime;
    

    public void writecvs(String logname) throws IOException{

    FileWriter fw = new FileWriter(logname);
    PrintWriter out = new PrintWriter(fw);
   // ',' divides the word into columns
    out.print("This");// first row first column
    out.print(",");
    out.print("is");// first row second column
    out.print(",");
    out.println("amazing");// first row third column
       
    out.print("It's"); // second row first column.
    out.print(",");
    out.print("really");// second row second column
    out.print(",");
    out.print("amazing");// second row third column
      
   //Flush the output to the file
    out.flush();
       
   //Close the Print Writer
    out.close();
       
   //Close the File Writer
    fw.close();  
            
  }
    
}