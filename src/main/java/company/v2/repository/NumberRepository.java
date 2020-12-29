package company.v2.repository;

import java.util.List;

public interface NumberRepository {
    List<Double> getNumbers() throws NumberRepositoryException;
}
