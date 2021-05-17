package SaveTradeInfo;

import Model.Depot;

import java.io.*;
import java.util.ArrayList;

public class SavingFile {

  public SavingFile(ArrayList<Depot> depots){

      try{
          BufferedWriter bw = new BufferedWriter(
                  new FileWriter("C:\\Users\\pedro\\IdeaProjects\\OODP-CA2\\src\\main\\java\\Textefiles\\result.txt"));
          bw.write(String.valueOf(depots));
          bw.close();

      }catch (
              IOException e) {
          e.printStackTrace();
      }


  }
}
