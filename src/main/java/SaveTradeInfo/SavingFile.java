package SaveTradeInfo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// this class will save the transactions
public class SavingFile {

    // This is the method that will save the information
    public void SavingTransactions(ArrayList<String> infos, String filename) {
        try {
            // This creates a BufferedWriter that will save the values and create a new file in case it does not exist
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename + ".txt"));

            // writing all the transactions into the files
            for (String info : infos) {
                bw.write(info);
                bw.newLine();
            }

            // close the instance
            bw.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}