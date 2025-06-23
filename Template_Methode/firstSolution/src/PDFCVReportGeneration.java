import java.io.File;

public class PDFCVReportGeneration implements CVReportGeneration {
    @Override
    public GeneratedReport generateCVReport(String cvfilePath) {
        var file = readFile(cvfilePath);
        var extractData = extractData(file);
        var analyzeData = analyzeData(extractData);
        return generateReportOf(analyzeData);
    }

    private GeneratedReport generateReportOf(AnalyzedData analyzeData) {
        System.out.println("Generating Report from "+ analyzeData );
        return new GeneratedReport();
    }

    @Override
    public File readFile(String filePath) {
        System.out.println("Reading file "+ filePath);
        return null;
    }

    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data from Pdf file ");
        return null;
    }

    @Override
    public AnalyzedData analyzeData(Data data) {
        System.out.println("Analyzing Data from "+ data);
        return null;
    }
}
