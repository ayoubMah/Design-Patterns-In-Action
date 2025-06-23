import java.io.File;

public interface CVReportGeneration {

    public GeneratedReport generateCVReport(String cvfilePath);
    public File readFile(String filePath);
    public Data extractData(File file);
    public AnalyzedData analyzeData(Data data);

}
