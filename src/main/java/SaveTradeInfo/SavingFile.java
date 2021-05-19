package SaveTradeInfo;



import MyDepots.Depots;

import java.io.*;
import java.util.ArrayList;

public class SavingFile {

  public SavingFile(ArrayList<Depots> depots, String filename){

      try{
          BufferedWriter bw = new BufferedWriter(
                  new FileWriter("C:\\Users\\pedro\\IdeaProjects\\OODP-CA2\\src\\main\\java\\Textefiles\\" + filename));
          bw.write(String.valueOf(depots));
          bw.close();

      }catch (
              IOException e) {
          e.printStackTrace();
      }


  }
}
