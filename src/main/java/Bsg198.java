import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;

public class Bsg198 implements Methods{

    private ArrayList<String> list;
    private String startPath;
    private String finalPath;
    private String path;

    public Bsg198(ArrayList<String> list, String startPath, String finalPath, String path) {
        this.list = list;
        this.startPath = startPath;
        this.finalPath = finalPath;
        this.path = path;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getStartPath() {
        return startPath;
    }

    public void setStartPath(String startPath) {
        this.startPath = startPath;
    }

    public String getFinalPath() {
        return finalPath;
    }

    public void setFinalPath(String finalPath) {
        this.finalPath = finalPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void copyFile() throws Exception {
        File folder = new File(startPath);
        for (File file : folder.listFiles()) {
            String fileName = file.getName();

            String model = checkHasModel(fileName);


            if (!(model==null)) {
                if(fileName.contains(".xlsx")) {
                    StringBuilder str = new StringBuilder(finalPath + model + "_Bsg198.xlsx");
                    String newName = str.toString();
                    System.out.println(model);

                    if (isModelOnList(list, model)) {
                        File file2 = new File(newName);
                        Files.copy(file.toPath(), file2.toPath());
                        list.add(model);
                    }
                }
                if(fileName.contains(".xlsm")) {
                    StringBuilder str = new StringBuilder(finalPath + model + "_Bsg198.xlsm");
                    String newName = str.toString();
                    System.out.println(model);

                    if (isModelOnList(list, model)) {
                        File file2 = new File(newName);
                        Files.copy(file.toPath(), file2.toPath());
                        list.add(model);
                    }
                }

            }
        }
    }

    String checkHasModel(String fileName){
        if(fileName.charAt(0)=='A'){
            if(fileName.contains("Pass") && !(fileName.contains("pdf"))){
                String[] model = fileName.split("_");
                return model[0];
            }
            else return null;

        }

        return null;
    }
    }

