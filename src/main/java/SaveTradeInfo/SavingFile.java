package SaveTradeInfo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// this class will save the transactions
public class SavingFile {

    // This is the method that will save the information
    public static void SavingTransactions(String info, String filename) {
        try {
            // This creates a BufferedWriter that will save the values and create a new file in case it does not exist
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            // write the transactions
            bw.write(info);
            // close the instance
            bw.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}
