package helper;

import logger.LoggerClass;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.LifecycleMethodExecutionExceptionHandler;

public class ReportingExtension implements AfterTestExecutionCallback, LifecycleMethodExecutionExceptionHandler {

    public void afterTestExecution(ExtensionContext context) {
        boolean testFailed = context.getExecutionException().isPresent();
        String testClassName = context.getTestClass().toString();
        String testMethod = context.getTestMethod().toString();
        String trimmedClassName = testClassName.substring(testClassName.lastIndexOf("."))
                .replace(']', ' ')
                .replace('.', ' ')
                .trim();
        String trimmedMethod = testMethod.substring(testMethod.lastIndexOf("."))
                .replace(']', ' ')
                .replace('.', ' ')
                .replace("()", " ")
                .trim();
        if (!testFailed) {
            LoggerClass.LOGGER.info("{}.{} Completed Successfully!",
                    trimmedClassName,
                    trimmedMethod);
        } else {
            String exceptionMessage = context.getExecutionException().toString();
            LoggerClass.LOGGER.error("{}.{} Failed with Exception: {}",
                    trimmedClassName,
                    trimmedMethod,
                    exceptionMessage.substring(exceptionMessage.indexOf('[')));
        }
    }

    public void processException(String stage) {
    }

    public void handleBeforeAllMethodExecutionException(ExtensionContext ExtensionContext, Throwable throwable) throws Throwable {
        this.processException("BeforeAll");
        throw throwable;
    }

    public void handleBeforeEachMethodExecutionException(ExtensionContext ExtensionContext, Throwable throwable) throws Throwable {
        this.processException("BeforeEach");
        throw throwable;
    }

    public void handleAfterEachMethodExecutionException(ExtensionContext ExtensionContext, Throwable throwable) throws Throwable {
        this.processException("AfterEach");
        throw throwable;
    }

    public void handleAfterAllMethodExecutionException(ExtensionContext ExtensionContext, Throwable throwable) throws Throwable {
        this.processException("AfterAll");
        throw throwable;
    }
}
