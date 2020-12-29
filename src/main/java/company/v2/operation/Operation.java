package company.v2.operation;

import javax.management.OperationsException;

public interface Operation {
    double perform() throws OperationException;
}
