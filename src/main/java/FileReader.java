import java.util.ArrayList;

public class FileReader {


    public static void main(String[] args) throws Exception {
        Long startTime = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>();
        String startPath = "\\\\192.168.10.120\\maszyny\\Alt-198\\testowanieKopiowania\\alt-198\\report";
        String finalPath = "\\\\192.168.10.120\\maszyny\\Alt-198\\testowanieKopiowania\\alt-198\\copyTo\\";
        String notePadPath = "\\\\192.168.10.120\\maszyny\\Alt-198\\testowanieKopiowania\\alt-198\\copyTo\\lista.txt";
//        Alt198 alt198 = new Alt198(list, startPath, finalPath, notePadPath);
//        alt198.fileToList(list, notePadPath);
//        alt198.copyFile();
//        alt198.listToFile(list, notePadPath);
      //  System.out.println(System.currentTimeMillis() - startTime);

        ArrayList<String> list2 = new ArrayList<>();
        String startPath2 = "C:\\Users\\Lubichowo\\Desktop\\test";
        String finalPath2 = "C:\\Users\\Lubichowo\\Desktop\\copytest\\";
        String notePadPath2 = "C:\\Users\\Lubichowo\\Desktop\\copytest\\lista.txt";
        St116_2 alt198_2 = new St116_2(list2, startPath2, finalPath2, notePadPath2);
        alt198_2.fileToList(list2, notePadPath2);
        alt198_2.copyFile();
        alt198_2.listToFile(list2, notePadPath2);
        System.out.println(System.currentTimeMillis() - startTime);

    }

}






//public class FileReader {
//    private static ArrayList<String> list = new ArrayList<>();
//    private static Set<String> set = new HashSet<>();
//
//    public static void main(String[] args) throws Exception{
//        Long startTime = System.currentTimeMillis();
//        File folder = new File("C:/Users/Lubichowo/Desktop/test/");
//        String path = "C:/Users/Lubichowo/Desktop/copytest/lista.txt";
//        fileToSet(set, path);
//        for (File file: folder.listFiles()) {
//            String fileName = file.getName();
//            String [] model = fileName.split("_");
//            System.out.println(model[0] + "  plik xlsx");
//            StringBuilder str = new StringBuilder("C:/Users/Lubichowo/Desktop/copytest/" + file.getName());
//            String nowy = str.toString();
//            System.out.println(model[0]);
//
//            if(set.add(model[0])) {
//                File file2 = new File(nowy);
//                Files.copy(file.toPath(), file2.toPath());
//            }
//
//        }
//        setToFile(set,path);
//
//        System.out.println(System.currentTimeMillis()-startTime);
//    }
//
//
//    public static ArrayList<String> fileToList(ArrayList<String> list, String pathListOfAlternator) throws Exception{
//        FileInputStream fileInputStream = new FileInputStream(pathListOfAlternator);
//        Scanner scanner = new Scanner(fileInputStream);
//        while (scanner.hasNext()){
//            list.add(scanner.nextLine());
//        }
//        return list;
//    }
//
//    public static void listToFile(ArrayList<String> list, String pathListOfAlternator) throws Exception{
//        PrintWriter printWriter = new PrintWriter(pathListOfAlternator);
//        for (String model: list) {
//            printWriter.println(model);
//        }
//        printWriter.close();
//    }
//
//    public static boolean isModelOnList (ArrayList<String> list, String model){
//        for (String modelFromList: list) {
//            if(modelFromList.equals(model)) return false;
//        }
//        return true;
//    }
//
//    public static Set<String> fileToSet(Set<String> set, String pathListOfAlternator) throws Exception{
//        FileInputStream fileInputStream = new FileInputStream(pathListOfAlternator);
//        Scanner scanner = new Scanner(fileInputStream);
//        while (scanner.hasNext()){
//            set.add(scanner.nextLine());
//        }
//        return set;
//    }
//
//    public static void setToFile(Set<String> set, String pathListOfAlternator) throws Exception{
//        PrintWriter printWriter = new PrintWriter(pathListOfAlternator);
//        for (String model: set) {
//            printWriter.println(model);
//        }
//        printWriter.close();
//    }
//
////    public static Set<String> fileToSet(Set<String> set, String pathListOfAlternator) throws Exception{
////        FileInputStream fileInputStream = new FileInputStream(pathListOfAlternator);
////        Scanner scanner = new Scanner(fileInputStream);
////        while (scanner.hasNext()){
////            set.add(scanner.nextLine());
////        }
////        return set;
////    }
//
////    public static void setToFile(ArrayList<String> set, String pathListOfAlternator) throws Exception{
////        PrintWriter printWriter = new PrintWriter(pathListOfAlternator);
////        for (String model: set) {
////            printWriter.println(model);
////        }
////        printWriter.close();
////    }
//
//}
