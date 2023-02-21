import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public interface Methods
{
    default ArrayList<String> fileToList(ArrayList<String> list, String pathListOfAlternator) throws Exception{
        FileInputStream fileInputStream = new FileInputStream(pathListOfAlternator);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        return list;
    }

    default void listToFile(ArrayList<String> list, String pathListOfAlternator) throws Exception{
        PrintWriter printWriter = new PrintWriter(pathListOfAlternator);
        for (String model: list) {
            printWriter.println(model);
        }
        printWriter.close();
    }

    default boolean isModelOnList (ArrayList<String> list, String model){
        for (String modelFromList: list) {
            if(modelFromList.equals(model)) return false;
        }
        return true;
    }

    void copyFile() throws Exception;
}
