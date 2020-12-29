package company.v2.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    @Override
    public List<Double> getNumbers() throws NumberRepositoryException {
        List<Double> numberDoubles = new ArrayList<>();
        try {
            List<String> numbers = Files.readAllLines(Paths.get("C://Users/HunterAlex/Documents/numbers1.txt"));

            numbers.forEach(num -> {
                numberDoubles.add(Double.parseDouble(num));
            });
            // do not catch the general Exception
            // do not catch threadInterruptedException
        } catch (IOException e) {
            e.printStackTrace(); //TODO: CHANGE THIS
            throw new NumberRepositoryException("could not read the file C://Users/HunterAlex/Documents/numbers.txt",e);
        }

        return numberDoubles;
    }
}
