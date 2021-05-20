package SaveTradeInfo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// this class will save the transactions
public class SavingFile {

    // This is the method that will save the information
    public static void SavingTransactions(String depots, String filename) {
        try {
            // This creates a BufferedWriter that will save the values and create a new file in case it does not exist
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/Textefiles/" + filename));
            // write the transactions
            bw.write(String.valueOf(depots));
            // close the instance
            bw.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }
}
