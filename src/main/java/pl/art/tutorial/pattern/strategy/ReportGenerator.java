package pl.art.tutorial.pattern.strategy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class ReportGenerator {

    private OperationStrategy operationStrategy;

    void print(Integer... inst) {
        log.info(operationStrategy.operationName() + ": " + operationStrategy.operate(inst));
    }
}
